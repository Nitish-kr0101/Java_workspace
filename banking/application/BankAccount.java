package banking.application;

import banking.application.ExceptionHandler.InvalidAmountException;
import banking.application.ExceptionHandler.InsufficientBalanceException;

public class BankAccount {

    private double balance;
    private User user;

    public BankAccount(User user, double initialBalance) {
        this.user = user;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than 0");
        }
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than 0");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful.");
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
