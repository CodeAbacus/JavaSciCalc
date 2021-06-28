package com.zipcodewilmington.scientificcalculator;

public class Memory {

    double val;

    public void AddMemory(int a){
        this.val = a;
    }
    public void ResetMemory(){
        this.val = 0;
    }
    public double RecallMemory(){
        return this.val;
    }
}
