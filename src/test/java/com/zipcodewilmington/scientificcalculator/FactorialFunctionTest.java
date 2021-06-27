package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialFunctionTest {

    @Test
    public void factorialTest() {

        FactorialFunction f = new FactorialFunction();

        int expected = 2076180480;
        int actual = f.Factorial(25);

        System.out.println(actual);
        assertEquals(expected, actual);




    }
}