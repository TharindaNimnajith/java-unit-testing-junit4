package v03_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractTest {
    @Test
    public void testMinus() {
        Subtract instance = new Subtract();
        int a = 17;
        int b = 5;
        int expResult = 12;
        int result = instance.minus(a, b);
        assertEquals(expResult, result);
    }
}
