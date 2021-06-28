package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialFunctionTest {

    @Test
    public void factorialTest() {

        Calculator calculate = new Calculator();

        int expected = 479001600;
        calculate.changeDisplayToInput(12);
        double actual = calculate.factorial();

        System.out.println(actual);
        assertEquals(expected, actual,0);




    }
}