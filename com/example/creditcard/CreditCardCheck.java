package com.example.creditcard;

import java.util.Scanner;

public class CreditCardCheck {

    static void checkCard(String cardNumber) throws InvalidCardException {

        if (cardNumber.length() != 16) {
            throw new InvalidCardException("Credit card number must be 16 digits");
        }

        System.out.println("Valid Credit Card Number ✅");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 16 digit credit card number:");
        String cardNumber = sc.nextLine();

        try {
            checkCard(cardNumber);
        } catch (InvalidCardException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
