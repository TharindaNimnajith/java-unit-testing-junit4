package v03_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideTest {
    @Test
    public void testQuotient() {
        Divide instance = new Divide();

        int numerator = 0;
        int denominator = 0;
        int expResult = 0;
        int result = instance.quotient(numerator, denominator);
        assertEquals(expResult, result);

        numerator = 10;
        denominator = 2;
        expResult = 5;
        result = instance.quotient(numerator, denominator);
        assertEquals(expResult, result);
    }
}
