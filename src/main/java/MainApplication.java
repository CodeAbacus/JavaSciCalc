import java.util.Scanner;


/**
 * Created by leon on 2/9/18.
 */

public class MainApplication {

    public static void main(String[] args) {
        CoreFeatures calculate = new CoreFeatures();
        boolean loop = true;
        Console.println("Welcome to my calculator!");
        Console.println("Current display is: %s", calculate.showsDisplayValue());

        while (loop) {

            char operationInput = Console.getCharInput("+ is plus, - is minus, / is divided by, * is multiplied by," +
                    " e is end, c is change display, x is clear, \ns is square, r is square root, y is x to the y, i is 1/input," +
                    " @ is to invert the sign, b is current display\nEnter one of the options:");

            switch (operationInput) {

                case '+':
                    double input = Console.getDoubleInput("Enter a number:");
                    calculate.addition(input);
                    break;

                case '-':
                    input = Console.getDoubleInput("Enter a number:");
                    calculate.subtraction(input);
                    break;

                case '/':
                    input = Console.getDoubleInput("Enter a number:");
                    calculate.division(input);
                    break;

                case '*':
                    input = Console.getDoubleInput("Enter a number:");
                    calculate.multiplication(input);
                    break;

                case 'b':
                    calculate.showsDisplayValue();
                    break;

                case 'x':
                    calculate.revertToZero();
                    break;

                case 'c':
                    input = Console.getDoubleInput("Enter a number:");
                    calculate.changeDisplayToInput(input);
                    Console.println("The current display is: %s", input);
                    break;

                case 's':
                    calculate.square();
                    break;

                case 'r':
                    calculate.squareRoot();
                    break;

                case 'y':
                    input = Console.getDoubleInput("Enter a number:");
                    calculate.exponentiation(input);
                    break;

                case 'i':
                    calculate.inverse();
                    break;

                case '@':
                    calculate.switchSign();
                    break;

                case 'f':
                    calculate.showFraction();
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