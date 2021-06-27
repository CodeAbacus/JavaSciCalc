import java.util.Scanner;

public class CoreFeatures {
    double display;
    double input;

    public CoreFeatures() {
        display = 0;
    }
    public double showsDisplayValue() {
        Console.println("%s", display);
        return display;
    }
    public double changeDisplayToInput(double input) {
        Console.println("%s", input);
        display = input;
        return display;
    }
    public double revertToZero() {
        display = 0;
        Console.println("%s", display);
        return display;
    }
    public double addition(double input) {
        double sum = display + input;
        display = sum;
        Console.println("The current display is: %s", display);
        return display;
    }
    public double subtraction(double input) {
        double difference = display - input;
        display = difference;
        Console.println("The current display is: %s", display);
        return display;
    }
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
    public double multiplication(double input) {
        double product = display * input;
        display = product;
        Console.println("The current display is: %s", display);
        return display;
    }
    public double square() {
        double square = display * display;
        display = square;
        Console.println("The current display is: %s", display);
        return display;
    }
    public double squareRoot() {
        double squareRoot = display / display;
        display = squareRoot;
        Console.println("The current display is: %s", display);
        return display;
    }
}



