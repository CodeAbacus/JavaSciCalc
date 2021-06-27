
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */

public class MainApplication {
    // String stringInput = Console.getStringInput("Enter a string");
    // Integer integerInput = Console.getIntegerInput("Enter an integer");
    // Double doubleInput = Console.getDoubleInput("Enter a double.");
    // Console.println("The user input %s as a string", stringInput);
    // Console.println("The user input %s as a integer", integerInput);
    // Console.println("The user input %s as a double", doubleInput);


    public static void main(String[] args) {
        CoreFeatures calculate = new CoreFeatures();
        boolean loop = true;
        Console.println("Welcome to my calculator!");
        Console.println("Current display is: %s", calculate.showsDisplayValue());
        // \nCurrent display is: %s", display.resetToZero()
        while (loop) {
            // Console.println("Current display is: %s", display.currentDisplayNumber(result));
            char operationInput = Console.getCharInput("+ is plus, - is minus, / is divided by, * is multiplied by," +
                    " e is end, c is change display, x is clear, \ns is square, r is square root, y is x to the y, i is 1/input," +
                    " @ is to invert the sign, b is current display\nEnter one of the options:");

            switch (operationInput) {

                case '+':
                    double input = Console.getDoubleInput("Enter a number");
                    calculate.addition(input);
                    break;

                case '-':
                    input = Console.getDoubleInput("Enter a number");
                    calculate.subtraction(input);
                    break;

                case '/':
                    input = Console.getDoubleInput("Enter a number");
                    calculate.division(input);
                    break;

                case '*':
                    input = Console.getDoubleInput("Enter a number");
                    calculate.multiplication(input);
                    break;

                case 'b':
                    calculate.showsDisplayValue();
                    break;

                case 'x':
                    calculate.revertToZero();
                    break;

                case 'c':
                    input = Console.getDoubleInput("Enter a number");
                    calculate.changeDisplayToInput(input);
                    break;

                case 's':
                    calculate.square();
                    break;

                case 'r':
                    calculate.squareRoot();
                    break;

                case 'e':
                    loop = false;
                    break;


                default:
                    Console.println("Err");
                    calculate.revertToZero();
                    Console.println("The current display is: %s", calculate.showsDisplayValue());
                    break;
            }
        }
    }
}



            //numberInput = Console.getDoubleInput("Enter a number");











        // CoreFeatures inputAsDouble = new CoreFeatures(Console.getDoubleInput("Enter a double."));
        // CoreFeatures inputAsInteger = new CoreFeatures(Console.getIntegerInput("Enter an integer"));
        // CoreFeatures inputAsString = new CoreFeatures(Console.getDoubleInput("Enter a double."));

