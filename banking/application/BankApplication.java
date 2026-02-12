package banking.application;

import banking.application.ExceptionHandler.InvalidAmountException;
import banking.application.ExceptionHandler.InsufficientBalanceException;
import banking.application.ExceptionHandler.InvalidLoginException;

import java.util.List;
import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<User> users = DataStorage.loadUsers();

        System.out.println("Welcome to Banking Application");

        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int mainChoice = sc.nextInt();
            sc.nextLine();

            if (mainChoice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter phone: ");
                String phone = sc.nextLine();

                System.out.print("Enter address: ");
                String address = sc.nextLine();

                System.out.print("Create password: ");
                String password = sc.nextLine();

                System.out.print("Enter initial balance: ");
                double balance = sc.nextDouble();
                sc.nextLine();

                User newUser = new User(name, phone, address, password, balance);
                users.add(newUser);
                DataStorage.saveUsers(users);

                System.out.println("Registration successful!");

            } else if (mainChoice == 2) {

                System.out.print("Enter phone: ");
                String phone = sc.nextLine();

                System.out.print("Enter password: ");
                String password = sc.nextLine();

                User loggedInUser = null;

                try {
                    loggedInUser = login(users, phone, password);
                    System.out.println("Login successful!");
                } catch (InvalidLoginException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                int choice;
                do {
                    System.out.println("\nPlease select the option:");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdrawal");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Edit Profile");
                    System.out.println("5. Change Password");
                    System.out.println("6. EXIT");

                    choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            try {
                                System.out.print("Enter amount to deposit: ");
                                double depositAmount = sc.nextDouble();
                                sc.nextLine();
                                loggedInUser.getAccount().deposit(depositAmount);
                                DataStorage.saveUsers(users);
                            } catch (InvalidAmountException e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        case 2:
                            try {
                                System.out.print("Enter amount to withdraw: ");
                                double withdrawAmount = sc.nextDouble();
                                sc.nextLine();
                                loggedInUser.getAccount().withdraw(withdrawAmount);
                                DataStorage.saveUsers(users);
                            } catch (InvalidAmountException | InsufficientBalanceException e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        case 3:
                            loggedInUser.getAccount().checkBalance();
                            break;

                        case 4:
                            System.out.print("Enter new name: ");
                            String newName = sc.nextLine();

                            System.out.print("Enter new phone: ");
                            String newPhone = sc.nextLine();

                            System.out.print("Enter new address: ");
                            String newAddress = sc.nextLine();

                            loggedInUser.editProfile(newName, newPhone, newAddress);
                            DataStorage.saveUsers(users);
                            break;

                        case 5:
                            System.out.print("Enter old password: ");
                            String oldPass = sc.nextLine();

                            System.out.print("Enter new password: ");
                            String newPass = sc.nextLine();

                            loggedInUser.changePassword(oldPass, newPass);
                            DataStorage.saveUsers(users);
                            break;

                        case 6:
                            System.out.println("Logged out successfully.");
                            break;

                        default:
                            System.out.println("Invalid choice.");
                    }
                } while (choice != 6);

            } else if (mainChoice == 3) {
                System.out.println("Thank you for using Banking Application.");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }

    private static User login(List<User> users, String phone, String password) throws InvalidLoginException {
        for (User user : users) {
            if (user.getPhone().equals(phone) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new InvalidLoginException("Invalid phone or password!");
    }
}
