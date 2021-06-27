import junit.framework.TestCase;

public class CoreFeaturesTest extends TestCase {
    CoreFeatures display = new CoreFeatures();

    public void testShowsDisplayValue() {
        display.changeDisplayToInput(4);
        assertEquals(4.0, display.showsDisplayValue());
    }

    public void testChangeDisplayToInput() {
        assertEquals(2.0, display.changeDisplayToInput(2));
    }

    public void testRevertToZero() {
        display.changeDisplayToInput(2);
        assertEquals(0.0, display.revertToZero());
    }

    public void testAddition() {
        display.changeDisplayToInput(2);
        assertEquals(4.0,display.addition(2));
    }

    public void testSubtraction() {
        display.changeDisplayToInput(6);
        assertEquals(4.0,display.subtraction(2));
    }

    public void testDivision() {
        display.changeDisplayToInput(8);
        assertEquals(4.0,display.division(2));
    }

    public void testMultiplication() {
        display.changeDisplayToInput(2);
        assertEquals(4.0,display.multiplication(2));
    }

    public void testSquare() {
        display.changeDisplayToInput(4);
        assertEquals(16.0, display.square());
    }

    public void testSquareRoot() {
        display.changeDisplayToInput(4);
        assertEquals(2.0, display.squareRoot());
    }

    public void testExponentiation() {
        display.changeDisplayToInput(4);
        assertEquals(256.0, display.exponentiation(4));
    }

    public void testInverse() {
        display.changeDisplayToInput(4);
        assertEquals(0.25, display.inverse());
    }

    public void testSwitchSign() {
        display.changeDisplayToInput(4);
        assertEquals(-4.0, display.switchSign());
    }

    public void testShowFraction() {
        display.changeDisplayToInput(0.5);
        assertEquals("5 / 10", display.showFraction());
    }
}