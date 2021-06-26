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
        CoreFeatures display = new CoreFeatures(0);
        Console.println("Welcome to my calculator!\nCurrent display is: %s", display.resetToZero());
        String stringInput = Console.getStringInput("Enter an operation, or type 'info' for more details");
        CoreFeatures inputAsDouble = new CoreFeatures(Console.getDoubleInput("Enter a double."));
        CoreFeatures inputAsInteger = new CoreFeatures(Console.getIntegerInput("Enter an integer"));
        CoreFeatures inputAsString = new CoreFeatures(Console.getDoubleInput("Enter a double."));

    }
}
