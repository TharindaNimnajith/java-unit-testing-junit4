package v03_03;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class CalculatorTest {
    @SuppressWarnings({"SimplifiableAssertion", "ConstantConditions"})
    // message argument in Ignore annotation is optional
    @Ignore("Ignore this test case")
    @Test
    public void testMain() {
        assertFalse(true);
    }
}
