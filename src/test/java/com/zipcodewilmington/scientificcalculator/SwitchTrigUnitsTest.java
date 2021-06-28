package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwitchTrigUnitsTest {

    @Test
    public void sinTest() {
        CoreFeatures calculate = new CoreFeatures();
        calculate.changeDisplayToInput(50);
        calculate.sin();
        double actual = calculate.switchUnitsMode("degrees");
        double expected = 0.766044443118978;

        System.out.println(actual);
        assertEquals(expected, actual,14);
    }
    @Test
    public void cosineTest(){
        CoreFeatures calculate = new CoreFeatures();
        calculate.changeDisplayToInput(45);
        calculate.cosine();
        double actual = calculate.switchUnitsMode("degrees");
        double expected = 0.70710678118;

        System.out.println(actual);
        assertEquals(expected, actual,14);

    }
    @Test
    public void tangentTest(){
        CoreFeatures calculate = new CoreFeatures();
        calculate.changeDisplayToInput(85);
        calculate.tangent();
        double actual = calculate.switchUnitsMode("degrees");
        double expected = 11.43005230276;

        System.out.println(actual);
        assertEquals(expected, actual,14);

    }
}