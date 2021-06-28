package com.zipcodewilmington.scientificcalculator;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MemoryTest{

    @Test
    public void addMemoryTest() {
        Calculator m = new Calculator();
        double currentDisplay = 25;
        double displayAlreadyAdded = 25;
        double expected = 50;
        m.changeDisplayToInput(displayAlreadyAdded);
        m.addMemory();
        m.changeDisplayToInput(currentDisplay);
        double actual = m.addMemory();
        assertEquals(expected,actual,0);


    }

    @Test
    public void resetTest(){
        Calculator m = new Calculator();
        double currentDisplay = 12;
        double expected = 0;
        m.changeDisplayToInput(currentDisplay);
        double actual = m.resetMemory();
        assertEquals(expected,actual,0);
    }

    @Test
    public void recallTest(){
        Calculator m = new Calculator();
        double displayAlreadyAdded = 25;
        double expected = 25;
        m.changeDisplayToInput(displayAlreadyAdded);
        double actual = m.addMemory();
        assertEquals(expected,actual,0);

    }

}