package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import com.zipcodewilmington.scientificcalculator.Console;
import com.zipcodewilmington.scientificcalculator.CoreFeatures;


/**
 * Created by leon on 2/9/18.
 */

public class MainApplication {

    public static void main(String[] args) {
        CoreFeatures calculate = new CoreFeatures();
        boolean loop = true;
        Console.println("Welcome to Our Calculator!");
        Console.println("Current display is: %s", 0);
        double startingValue = Console.getDoubleInput("Enter a starting number:");
        calculate.changeDisplayToInput(startingValue);


        while (loop) {
            String operationInput = Console.getStringInput("Enter an Operation, or Enter 'info' to See Full List");

            if ("add".equals(operationInput)) {
                double input = Console.getDoubleInput("Enter a number:");
                calculate.addition(input);
            }
            else if ("subtract".equals(operationInput)) {
                double input = Console.getDoubleInput("Enter a number:");
                calculate.subtraction(input);
            }
            else if ("divide".equals(operationInput)) {
                double input = Console.getDoubleInput("Enter a number:");
                calculate.division(input);
            }
            else if ("multiply".equals(operationInput)) {
                double input = Console.getDoubleInput("Enter a number:");
                calculate.multiplication(input);
            }
            else if ("display".equals(operationInput)) {
                calculate.showsDisplayValue();
            }
            else if ("clear".equals(operationInput)) {
                calculate.revertToZero();
            }
            else if ("change display".equals(operationInput)) {
                double input = Console.getDoubleInput("Enter a number:");
                calculate.changeDisplayToInput(input);
                Console.println("The current display is: %s", input);
            }
            else if ("square".equals(operationInput)) {
                calculate.square();
            }
            else if ("square root".equals(operationInput)) {
                calculate.squareRoot();
            }
            else if ("exponent".equals(operationInput)) {
                double input = Console.getDoubleInput("Enter a number:");
                calculate.exponentiation(input);
            }
            else if ("inverse".equals(operationInput)) {
                calculate.inverse();
            }
            else if ("switch sign".equals(operationInput)) {
                calculate.switchSign();
            }
            else if ("fraction".equals(operationInput)) {
                calculate.showFraction();
            }
            else if ("end".equals(operationInput)) {
                loop = false;
            }
            else if ("binary".equals(operationInput) || "hex".equals(operationInput) || "octal".equals(operationInput)) {
                calculate.switchDisplayMode(operationInput);

            }
            else if ("rotate display".equals(operationInput)) {
                calculate.switchDisplayModeByRotating();
            }
            else if ("cube".equals(operationInput)) {
                calculate.cubed();
            }
            else if ("factorial".equals(operationInput)) {
                calculate.factorial();
            }
            else if ("store".equals(operationInput)) {
                calculate.addMemory();
            }
            else if ("reset".equals(operationInput)) {
                calculate.resetMemory();
            }
            else if ("recall".equals(operationInput)) {
                calculate.recallMemory();
            }
            else if ("info".equals(operationInput)) {
                Console.println("Your operations to choose from are: add, subtract, divide, multiply, display, clear,\n" +
                        "change display, square, square root, exponent, inverse, switch sign, fraction, end,\nbinary, hex, octal, rotate display, cube, factorial," +
                        " store, reset, recall, sine, cosine,\ntangent, inverse sine, inverse cosine, inverse tangent, radians, degrees, rotate units,\n" +
                        "log, natural log, inverse log, inverse natural log");
                calculate.showsDisplayValue();
            }
            else if ("sine".equals(operationInput)) {
                calculate.sin();
            }
            else if ("inverse sine".equals(operationInput)) {
                calculate.inverseSine();
            }
            else if ("cosine".equals(operationInput)) {
                calculate.cosine();
            }
            else if ("inverse cosine".equals(operationInput)) {
                calculate.inverseCosine();
            }
            else if ("tangent".equals(operationInput)) {
                calculate.tangent();
            }
            else if ("inverse tangent".equals(operationInput)) {
                calculate.inverseTangent();
            }
            else if ("radians".equals(operationInput)) {
                calculate.switchUnitsMode(operationInput);
            }
            else if ("degrees".equals(operationInput)) {
                calculate.switchUnitsMode(operationInput);
            }
            else if ("rotate units".equals(operationInput)) {
                calculate.switchUnitsModeByRotating();
            }
            else if ("log".equals(operationInput)) {
                calculate.log();
            }
            else if ("natural log".equals(operationInput)) {
                calculate.naturalLog();
            }
            else if ("inverse log".equals(operationInput)) {
                calculate.inverseLog();
            }
            else if ("inverse natural log".equals(operationInput)) {
                calculate.inverseNaturalLog();
            }
        }
    }
}