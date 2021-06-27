import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    String stringInput;
    int integerInput;
    double doubleInput;

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void printf(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String stringInput = scanner.nextLine();
        return stringInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int integerInput = scanner.nextInt();
        return integerInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        double doubleInput = scanner.nextDouble();
        return doubleInput;
    }
    public static char getCharInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        char charInput = scanner.next().charAt(0);
        return charInput;
    }
}
