package com.zipcodewilmington.scientificcalculator;

public class FactorialFunction {

    public static int Factorial(int number){
        int fact=1;
        for(int i=1; i<=number; i++){
            fact=fact*i;}

        return fact;


    }
}
