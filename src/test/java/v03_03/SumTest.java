package v03_03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {
    public SumTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of summation method, of class Sum.
     */
    @Test
    public void testSummation() {
        System.out.println("summation");
        int[] nums = {1, 2, 3, 4, 5};
        Sum instance = new Sum();
        int expResult = 15;
        int result = instance.summation(nums);
        assertEquals(expResult, result);
    }
}
