import java.util.Scanner;

public class CoreFeatures {
    double display;
    double input;

    public CoreFeatures() {
        display = 0;
    }
    public double showsDisplayValue() {
        return display;
    }
    public double revertToZero() {
        display = 0;
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
        double quotient = display / input;
        display = quotient;
        Console.println("The current display is: %s", display);
        return display;
    }
    public double multiplication(double input) {
        double product = display * input;
        display = product;
        Console.println("The current display is: %s", display);
        return display;
    }
}



