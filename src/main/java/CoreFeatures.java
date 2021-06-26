public class CoreFeatures {
    int display;

    public CoreFeatures(int standardDisplay) {
    }
    public CoreFeatures(double integerIsInput) {
        Console.getIntegerInput("Enter a int.");
    }
    public CoreFeatures(String stringIsInput) {
        Console.getStringInput("Enter a string.");
    }
    public int resetToZero() {
        display = 0;
        return display;
    }
    public double addition(double input) {
        return display + input;
    }
    public double subtraction(double input) {
        return display - input;
    }
    public double division(double input) {
        return display / input;
    }
    public double multiplication(double input) {
        return display / input;
    }
}

