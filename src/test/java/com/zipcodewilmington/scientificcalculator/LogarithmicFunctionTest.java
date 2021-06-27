package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class LogarithmicFunctionTest {



        @Before
        public void setUp() throws Exception {
        }

        @After
        public void tearDown() throws Exception {
        }

        LogarithmicFunction l = new LogarithmicFunction();
        @Test
        public void logTest() {

            double expected = 15.761420707019587;
            double actual;

            actual= l.Log(7000000);

            System.out.println(actual);
            assertEquals(expected,actual,14);

        }

        @Test
        public void InverseLogarithmTest(){
            double expected = 5.3979400086720375;
            double actual;

            actual= l.InverseLogarithm(250000);

            System.out.println(actual);

            assertEquals(expected, actual,14);

        }
}