package v03_02;

import org.junit.Test;

import java.util.ArrayList;

public class ExceptionHandlingTest {
    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMain() {
        new ArrayList<>().get(0);
    }

    @SuppressWarnings({"unused", "NumericOverflow", "divzero"})
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        int x = 10 / 0;
    }
}
