import java.util.Scanner;

public class CoreFeatures {
    double display = 0;
    String fraction;


    // Constructor for an object "calculator" that has a display value of 0
    public CoreFeatures() {
    }
    // Will show the number on the display as a 'binary' 'hexadecimal' 'octal' or 'decimal' based on user input
    public String switchDisplayMode(String mode) {
        if ("binary".equals(mode)) {
            int currentDisplay = (int) display;
            String binaryString = Integer.toBinaryString(currentDisplay);
            Console.println("The current display is the binary number: %s", binaryString);
            String string = binaryString;
            return string;
        }
        else if ("hex".equals(mode)) {
            int currentDisplay = (int) display;
            String hexString = Integer.toHexString(currentDisplay);
            Console.println("The current display is the hexadecimal number: %s", hexString);
            String string = hexString;
            return string;
        }
        else if ("octal".equals(mode)) {
            int currentDisplay = (int) display;
            String octalString = Integer.toOctalString(currentDisplay);
            Console.println("The current display is the octal number: %s", octalString);
            String string = octalString;
            return string;
        }
        else {
            String string = String.format("%s", display);
            return string;
        }
    }



    // Will switch the display mode to 'binary' 'hexadecimal' 'octal' or 'decimal' on a rotation
     public String switchDisplayModeByRotating() {
        int currentDisplay = (int) display;
        String binaryString = Integer.toBinaryString(currentDisplay);
        Console.println("The current display is the binary number: %s", binaryString);
        String userInput = Console.getStringInput("Would you like to switch to the next mode? Y or N");
        if ("y".equals(userInput)) {
            currentDisplay = (int) display;
            String octalString = Integer.toOctalString(currentDisplay);
            Console.println("The current display is the octal number: %s", octalString);
            String userInput1 = Console.getStringInput("Would you like to switch to the next mode? Y or N");
            if ("y".equals(userInput1)) {
                currentDisplay = (int) display;
                String hexString = Integer.toHexString(currentDisplay);
                Console.println("The current display is the hexadecimal number: %s", hexString);
                String userInput2 = Console.getStringInput("Would you like to switch to the next mode? Y or N");
                if ("y".equals(userInput2)) {
                    String string = String.format("%s", display);
                    Console.println("The current display is: %s", string);
                }
            }
        }
        return null;
    }

    // Will print the value of the display to the console
    public double showsDisplayValue() {
        Console.println("The current display is: %s", display);
        return display;
    }
    // Will change the value of the display to the number that is input by the user
    public double changeDisplayToInput(double input) {
        display = input;
        return display;
    }
    // Will change the value of the display back to zero, which is its default position
    public double revertToZero() {
        display = 0;
        Console.println("The current display is: %s", display);
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
        double square = Math.pow(display,2);
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
    public double exponentiation(double input) {
        double exponent = Math.pow(display,input);
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
    // Will show the number on the display as a fraction
    public String showFraction() {
        double displayWithDecimals = display;
        String displayToString = String.format("%s", displayWithDecimals);
        String[] splitAtDecimal = displayToString.split("\\.");
        int beforeDecimalAsInt = Integer.parseInt(splitAtDecimal[0]);
        int afterDecimalAsInt = Integer.parseInt(splitAtDecimal[1]);
        String beforeDecimal = String.format("%s", beforeDecimalAsInt);
        String afterDecimal = String.format("%s", afterDecimalAsInt);;
        int numberOfPlacesAfterDecimal = splitAtDecimal[1].length();
        int denominator = (int) Math.pow(10, numberOfPlacesAfterDecimal);
        if (Integer.parseInt(beforeDecimal) != 0 && Integer.parseInt(afterDecimal) == 0) {
            fraction = String.format("%s/1", beforeDecimal);
        }
        else if (Integer.parseInt(beforeDecimal) != 0 && Integer.parseInt(afterDecimal) != 0){
            fraction = String.format("%s and %s/%s", beforeDecimal, afterDecimal, denominator);
        }
        else if (Integer.parseInt(beforeDecimal) == 0 && Integer.parseInt(afterDecimal) != 0){
            fraction = String.format("%s/%s", afterDecimal, denominator);
        }
        else {
            fraction = "0";
        }
        Console.println("The current display is: %s", display);
        Console.println("The display shown as a fraction is: " + fraction);
        return fraction;
    }
    // Will raise the number on the display to the 3rd power
    public double cubed() {
        double cube = Math.pow(display,3);
        display = cube;
        Console.println("The current display is: %s", display);
        return display;
    }
}



