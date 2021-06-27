package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class SwitchTrigUnitsTest {

    SwitchTrigUnits s = new SwitchTrigUnits();
    @Test
    public void sinTest() {

        double actual = s.Sin(50.0);
        double expected = 0.8726646259971648;

        System.out.println(actual);
        assertEquals(expected, actual,14);
    }
    @Test
    public void cosineTest(){

        double actual = s.Sin(45.0);
        double expected = 0.7853981633974483;

        System.out.println(actual);
        assertEquals(expected, actual,14);

    }
    @Test
    public void tangentTest(){

        double actual = s.Sin(85.0);
        double expected = 1.48352986419518;

        System.out.println(actual);
        assertEquals(expected, actual,14);

    }
}