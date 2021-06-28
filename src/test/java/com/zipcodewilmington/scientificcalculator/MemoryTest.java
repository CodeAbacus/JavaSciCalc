package com.zipcodewilmington.scientificcalculator;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MemoryTest{

    Memory m = new Memory();
    @Test
    public void AddMemoryTest() {

        double actual = 25;

        m.AddMemory(25);
        double expected = m.val;
        assertEquals(actual,expected,0);


    }

    @Test
    public void resetTest(){

        double actual = 0;
        m.ResetMemory();
        double expected = m.val;
        assertEquals(actual,expected,0);
    }

    @Test
    public void recallTest(){

        double actual = 0;
        m.RecallMemory();
        double expected = m.val;
        assertEquals(actual,expected,0);

    }

}