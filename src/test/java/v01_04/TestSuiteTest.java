package v01_04;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SuiteTest1.class,
        SuiteTest2.class,
})

public class TestSuiteTest {
    public TestSuiteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class TestSuite.
     */
    @Test
    public void testMain() {
    }
}
