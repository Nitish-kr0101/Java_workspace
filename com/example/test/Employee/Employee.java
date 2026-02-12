package com.example.test.Employee;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private String designation;
    private int leavesTaken;

    private static final int TOTAL_LEAVES = 32;

    // Constructor
    public Employee(int id, String name, double salary, String designation, int leavesTaken) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.leavesTaken = leavesTaken;
    }

    // Method to calculate final salary
    public double calculateSalary() {
        double finalSalary = salary;

        // Add increment based on designation
        if (designation.equalsIgnoreCase("Programmer")) {
            finalSalary += salary * 0.10; // 10% increment
        } else if (designation.equalsIgnoreCase("Designer")) {
            finalSalary += salary * 0.20; // 20% increment
        }

        // Deduct salary if leaves exceed 32
        if (leavesTaken > TOTAL_LEAVES) {
            int extraLeaves = leavesTaken - TOTAL_LEAVES;
            double perDaySalary = salary / 30; // assuming 30 working days
            finalSalary -= perDaySalary * extraLeaves;
        }

        return finalSalary;
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Leaves Taken: " + leavesTaken);
        System.out.println("Final Salary: " + calculateSalary());
    }
}
