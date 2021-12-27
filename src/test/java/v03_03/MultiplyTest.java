package v03_03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    public MultiplyTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of times method, of class Multiply.
     */
    @Test
    public void testTimes() {
        System.out.println("times");
        int c = 10;
        int d = 34;
        Multiply instance = new Multiply();
        int expResult = 340;
        int result = instance.times(c, d);
        assertEquals(expResult, result);
    }
}
