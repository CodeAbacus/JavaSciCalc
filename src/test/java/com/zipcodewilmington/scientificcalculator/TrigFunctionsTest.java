package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TrigFunctionsTest {

    @Test
    public void testSin() {
        Calculator calculate = new Calculator();
        double expected = -0.13235175009777303;
        double actual;

        calculate.changeDisplayToInput(25);
        actual= calculate.sin();

        System.out.println(actual);

        assertEquals(expected, actual,14);

    }
    @Test
    public void Cosine() {
        Calculator calculate = new Calculator();
        double expected = -0.9880316240928618;
        double actual;

        calculate.changeDisplayToInput(30);
        actual= calculate.cosine();

        System.out.println(actual);

        assertEquals(expected, actual,14);

    }
    @Test
    public void Tangent() {
        Calculator calculate = new Calculator();
        double expected = 0.6502878401571168;
        double actual;

        calculate.changeDisplayToInput(15);
        actual= calculate.tangent();

        System.out.println(actual);

        assertEquals(expected, actual,14);

    }
    @Test
    public void InverseSine() {
        Calculator calculate = new Calculator();
        double expected = 1.570796326794897;
        double actual;

        calculate.changeDisplayToInput(1);
        actual= calculate.inverseSine();

        System.out.println(actual);

        assertEquals(expected, actual,14);

    }
    @Test
    public void InverseCosine() {
        Calculator calculate = new Calculator();
        double expected = 1.047197551196598;
        double actual;

        calculate.changeDisplayToInput(0.5);
        actual= calculate.inverseCosine();

        System.out.println(actual);

        assertEquals(expected, actual,14);

    }
    @Test
    public void InverseTangent() {
        Calculator calculate = new Calculator();
        double expected = -0.7148764296291646;
        double actual;

        calculate.changeDisplayToInput(150);
        actual= calculate.inverseTangent();

        System.out.println(actual);

        assertEquals(expected, actual,14);

    }


}
