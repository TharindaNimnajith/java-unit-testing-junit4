package v03_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {
    @Test
    public void testSummation() {
        Sum instance = new Sum();
        int[] nums = {1, 2, 3, 4, 5};
        int expResult = 15;
        int result = instance.summation(nums);
        assertEquals(expResult, result);
    }
}
