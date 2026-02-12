package banking.application;

public class User {

    private String name;
    private String phone;
    private String address;
    private String password;
    private BankAccount account;

    public User(String name, String phone, String address, String password, double balance) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.password = password;
        this.account = new BankAccount(this, balance);
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public void editProfile(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        System.out.println("Profile updated successfully.");
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password changed successfully.");
            return true;
        } else {
            System.out.println("Incorrect old password.");
            return false;
        }
    }

    @Override
    public String toString() {
        return name + "," + phone + "," + address + "," + password + "," + account.getBalance();
    }

    public static User fromString(String data) {
        String[] parts = data.split(",");
        return new User(parts[0], parts[1], parts[2], parts[3], Double.parseDouble(parts[4]));
    }
}
