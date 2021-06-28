package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwitchTrigUnitsTest {

    @Test
    public void sinTest() {
        Calculator calculate = new Calculator();
        double radianToDegrees = Math.toDegrees(20);
        calculate.changeDisplayToInput(radianToDegrees);
        double actual = calculate.sin();
        double expected = 0.342020143325669;

        System.out.println(actual);
        assertEquals(expected, actual,14);
    }
    @Test
    public void cosineTest(){
        Calculator calculate = new Calculator();
        double radiansToDegrees = Math.toDegrees(45);
        calculate.changeDisplayToInput(radiansToDegrees);
        double actual = calculate.cosine();
        double expected = 0.70710678118;

        System.out.println(actual);
        assertEquals(expected, actual,14);

    }
    @Test
    public void tangentTest(){
        Calculator calculate = new Calculator();
        double radiansToDegrees = Math.toDegrees(45);
        calculate.changeDisplayToInput(radiansToDegrees);
        double actual = calculate.tangent();;
        double expected = 1;

        System.out.println(actual);
        assertEquals(expected, actual,14);

    }
}