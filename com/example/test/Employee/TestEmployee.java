package com.example.test;

import org.testng.annotations.Test;
import com.example.test.Employee.Employee;

import static org.testng.AssertJUnit.assertEquals;

public class TestEmployee {

    @Test
    public void testProgrammerSalaryIncrease() {
        Employee emp = new Employee(1, "Rahul", 50000, "Programmer", 30);

        double expectedSalary = 50000 + (50000 * 0.10);
        assertEquals(expectedSalary, emp.calculateSalary(), 0.01);
    }

    @Test
    public void testDesignerSalaryIncrease() {
        Employee emp = new Employee(2, "Anu", 40000, "Designer", 28);

        double expectedSalary = 40000 + (40000 * 0.20);
        assertEquals(expectedSalary, emp.calculateSalary(), 0.01);
    }

    @Test
    public void testSalaryDeductionForExtraLeaves() {
        Employee emp = new Employee(3, "Raj", 30000, "Programmer", 35);

        double baseWithIncrement = 30000 + (30000 * 0.10);
        double perDaySalary = 30000 / 30;
        double deduction = perDaySalary * 3;

        double expectedSalary = baseWithIncrement - deduction;

        assertEquals(expectedSalary, emp.calculateSalary(), 0.01);
    }
}
