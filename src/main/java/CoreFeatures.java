import java.util.Scanner;

public class CoreFeatures {
    double display;

    // Constructor for an object "calculator" that has a display value of 0
    public CoreFeatures() {
        display = 0;
    }
    // Will print the value of the display to the console
    public double showsDisplayValue() {
        Console.println("%s", display);
        return display;
    }
    // Will change the value of the display to the number that is input by the user
    public double changeDisplayToInput(double input) {
        Console.println("%s", input);
        display = input;
        return display;
    }
    // Will change the value of the display back to zero, which is its default position
    public double revertToZero() {
        display = 0;
        Console.println("%s", display);
        return display;
    }
    // Will add the number input by the user to the number on the display
    public double addition(double input) {
        double sum = display + input;
        display = sum;
        Console.println("The current display is: %s", display);
        return display;
    }
    // Will subtract the number input by the user from the number on the display
    public double subtraction(double input) {
        double difference = display - input;
        display = difference;
        Console.println("The current display is: %s", display);
        return display;
    }
    // Will divide the number on the display by the number input by the user, will print "Err" if 0 is input
    public double division(double input) {
        if (input == 0) {
            Console.println("Err");
            display = 0;
        }
        else {
            double quotient = display / input;
            display = quotient;
        }
        Console.println("The current display is: %s", display);
        return display;
    }
    // Will multiply the number on the display by the number input by the user
    public double multiplication(double input) {
        double product = display * input;
        display = product;
        Console.println("The current display is: %s", display);
        return display;
    }
    // Will print the product of the number on the display squared
    public double square() {
        double square = Math.pow(display,display);
        display = square;
        Console.println("The current display is: %s", display);
        return display;
    }
    // Will print the square root of the number on the display, if the number to square root is negative it will show "Err"
    public double squareRoot() {
        if (display < 0) {
            Console.println("Err");
            display = 0;
        }
        else {
            double squareRoot = Math.sqrt(display);
            display = squareRoot;
        }
        Console.println("The current display is: %s", display);
        return display;
    }
    // Will print the product of the first input to the power of the second input
    public double exponentiation(double x, double y) {
        double exponent = Math.pow(x,y);
        display = exponent;
        Console.println("The current display is: %s", display);
        return display;
    }
    // Will print the quotient of 1 divided by the number on the display
    public double inverse() {
        double inverse = 1 / display;
        display = inverse;
        Console.println("The current display is: %s", display);
        return display;
    }
    // Will switch the sign of the number on the display (negative to positive and vice versa)
    public double switchSign() {
        double switchSign = display * -1;
        display = switchSign;
        Console.println("The current display is: %s", display);
        return display;
    }
}



