package v03_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    @Test
    public void testTimes() {
        Multiply instance = new Multiply();
        int c = 10;
        int d = 34;
        int expResult = 340;
        int result = instance.times(c, d);
        assertEquals(expResult, result);
    }
}
