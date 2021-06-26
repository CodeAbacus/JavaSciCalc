import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    String stringInput = Console.getStringInput("Enter a string");
    Integer integerInput = Console.getIntegerInput("Enter an integer");
    Double doubleInput = Console.getDoubleInput("Enter a double.");
    // Console.println("The user input %s as a string", stringInput);
    // Console.println("The user input %s as a integer", integerInput);
    // Console.println("The user input %s as a double", doubleInput);


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoreFeatures display = new CoreFeatures(0);
        String operationInput;
        double numberInput;
        double result;
        Console.println("Welcome to my calculator!\nCurrent display is: %s", display.resetToZero());
        operationInput = Console.getStringInput("Enter an operation, or type 'info' for more details");
        numberInput = Console.getIntegerInput("Enter a number");

        if ("+".equals(operationInput) || "add".equals(operationInput)) {
            result = display.addition(numberInput);
            Console.println("%s + %s equals: %s", display.currentDisplayNumber(), numberInput, result);
        } else if ("-".equals(operationInput) || "subtract".equals(operationInput)) {
            result = display.subtraction(numberInput);
            Console.println("%s - %s equals: %s", display.currentDisplayNumber(), numberInput, result);
        }
    }
}
        // CoreFeatures inputAsDouble = new CoreFeatures(Console.getDoubleInput("Enter a double."));
        // CoreFeatures inputAsInteger = new CoreFeatures(Console.getIntegerInput("Enter an integer"));
        // CoreFeatures inputAsString = new CoreFeatures(Console.getDoubleInput("Enter a double."));

