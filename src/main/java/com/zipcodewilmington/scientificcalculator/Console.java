package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String stringInput = scanner.nextLine();
        return stringInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int integerInput = scanner.nextInt();
        return integerInput;
    }
    // Will assign the next double input to the variable 'doubleInput'
    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        double doubleInput = scanner.nextDouble();
        return doubleInput;
    }
    // Will assign the next character input to the variable 'charInput'
    public static char getCharInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        char charInput = scanner.next().charAt(0);
        return charInput;
    }
}
