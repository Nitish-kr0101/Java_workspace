package com.example.test;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestCalculator {
    @Test
    public void testFindBig(){
        Calculator obj = new Calculator();
        assertEquals(20, obj.findBig(10, 20));

    }
    @Test
    public void testFindSmall(){
        Calculator obj = new Calculator();
        assertEquals(10, obj.findSmall(10, 20));

    }
}
