package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


class TrigFunctionsTest {

    TrigFunctions t = new TrigFunctions();
    @Test
    public void sin() {
        double expected = -0.13235175009777303;
        double actual;

        actual= t.sin(25);

        System.out.println(actual);

        assertEquals(expected, actual,14);

    }
    @Test
    public void Cosine() {
        double expected = -0.9880316240928618;
        double actual;

        actual= t.sin(30);

        System.out.println(actual);

        assertEquals(expected, actual,14);

    }
    @Test
    public void Tangent() {
        double expected = 0.6502878401571168;
        double actual;

        actual= t.sin(15);

        System.out.println(actual);

        assertEquals(expected, actual,14);

    }
    @Test
    public void InverseSine() {
        double expected = -0.3048106211022167;
        double actual;

        actual= t.sin(60);

        System.out.println(actual);

        assertEquals(expected, actual,14);

    }
    @Test
    public void InverseCosine() {
        double expected = 0.8939966636005579;
        double actual;

        actual= t.sin(90);

        System.out.println(actual);

        assertEquals(expected, actual,14);

    }
    @Test
    public void InverseTangent() {
        double expected = -0.7148764296291646;
        double actual;

        actual= t.sin(150);

        System.out.println(actual);

        assertEquals(expected, actual,14);

    }


}