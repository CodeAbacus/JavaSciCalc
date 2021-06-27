import junit.framework.TestCase;

public class CoreFeaturesTest extends TestCase {


    public void testShowsDisplayValue() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 5;
        double expectedDisplay = 5;
        // When
        double actualDisplay = display.changeDisplayToInput(currentDisplay);
        // Then
        assertEquals(expectedDisplay, actualDisplay);
    }

    public void testChangeDisplayToInput() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 4;
        double displayToBeChangedTo = 10;
        double expectedDisplay = 10;
        // When
        double actualDisplay = display.changeDisplayToInput(displayToBeChangedTo);
        // Then
        assertEquals(expectedDisplay, actualDisplay);
    }

    public void testRevertToZero() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 7;
        double expectedDisplay = 0;
        // When
        double actualDisplay = display.revertToZero();
        // Then
        assertEquals(expectedDisplay, actualDisplay);
    }

    public void testAddition() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 2;
        double userInput = 2;
        double expectedValue = 4;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.addition(userInput);
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testSubtraction() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 4;
        double userInput = 2;
        double expectedValue = 2;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.subtraction(userInput);
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testDivision() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 20;
        double userInput = 2;
        double expectedValue = 10;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.division(userInput);
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testMultiplication() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 10;
        double userInput = 2;
        double expectedValue = 20;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.multiplication(userInput);
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testSquare() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 10;
        double expectedValue = 100;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.square();
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testSquareRoot() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 16;
        double expectedValue = 4;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.squareRoot();
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testExponentiation() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 5;
        double userInput = 3;
        double expectedValue = 125;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.exponentiation(userInput);
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testInverse() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 5;
        double expectedValue = .2;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.inverse();
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testSwitchSign() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 5;
        double expectedValue = -5;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.switchSign();
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testShowFraction1() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = .005;
        String expectedValue = "5/1000";
        // When
        display.changeDisplayToInput(currentDisplay);
        String actualValue = display.showFraction();
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testShowFraction2() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 7;
        String expectedValue = "7/1";
        // When
        display.changeDisplayToInput(currentDisplay);
        String actualValue = display.showFraction();
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testShowFraction3() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 8.33;
        String expectedValue = "8 and 33/100";
        // When
        display.changeDisplayToInput(currentDisplay);
        String actualValue = display.showFraction();
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testShowFraction4() {
        // Given
        CoreFeatures display = new CoreFeatures();
        double currentDisplay = 0;
        String expectedValue = "0";
        // When
        display.changeDisplayToInput(currentDisplay);
        String actualValue = display.showFraction();
        // Then
        assertEquals(expectedValue,actualValue);
    }
}