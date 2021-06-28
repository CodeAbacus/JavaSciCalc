import java.util.Scanner;


/**
 * Created by leon on 2/9/18.
 */

public class MainApplication {

    public static void main(String[] args) {
        CoreFeatures calculate = new CoreFeatures();
        boolean loop = true;
        Console.println("Welcome to my calculator!");
        Console.println("Current display is: %s", 0);
        double startingValue = Console.getDoubleInput("Enter a starting number:");
        calculate.changeDisplayToInput(startingValue);

        while (loop) {
            String operationInput = Console.getStringInput("Choose one: add, subtract, divide, multiply, display, clear,\n" +
                    "change display, square, square root, exponent, inverse, switch sign, fraction, end");

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
            else if ("rotate".equals(operationInput)) {
                calculate.switchDisplayModeByRotating();
            }
            else if ("cube".equals(operationInput)) {
                calculate.cubed();
            }
            else {
                Console.println("Err");
                calculate.revertToZero();
                Console.println("The current display is: %s", calculate.showsDisplayValue());
            }
        }
    }
}