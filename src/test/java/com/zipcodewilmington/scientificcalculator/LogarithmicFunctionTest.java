package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogarithmicFunctionTest {



        @Before
        public void setUp() throws Exception {
        }

        @After
        public void tearDown() throws Exception {
        }


        @Test
        public void logTest() {

            Calculator calculate = new Calculator();
            double expected = 15.761420707019587;
            double actual;

            calculate.changeDisplayToInput(7000000);
            actual= calculate.log();

            System.out.println(actual);
            assertEquals(expected,actual,14);

        }

        @Test
        public void naturalLogarithmTest(){
            Calculator calculate = new Calculator();
            double expected = 5.3979400086720375;
            double actual;

            calculate.changeDisplayToInput(250000);
            actual= calculate.naturalLog();

            System.out.println(actual);

            assertEquals(expected, actual,14);

        }
}