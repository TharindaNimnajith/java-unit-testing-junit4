package v01_03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleAssertionsTest {
    public SampleAssertionsTest() {
    }

    @SuppressWarnings("EmptyMethod")
    @BeforeClass
    public static void setUpClass() {
    }

    @SuppressWarnings("EmptyMethod")
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "test".getBytes();
        byte[] actual = "test".getBytes();
        // passing the error message as the first argument is optional
        assertArrayEquals("failure - byte arrays not same", expected, actual);
    }

    // checks that two primitives/objects are equal
    @Test
    public void testAssertEquals() {
        assertEquals("failure - strings are not equal", "text", "text");
    }

    // checks that a condition is true
    @Test
    public void testAssertTrue() {
        assertTrue("failure - should be true", true);
    }

    // checks that a condition is false
    @Test
    public void testAssertFalse() {
        assertFalse("failure - should be false", false);
    }

    // checks that an object is null
    @Test
    public void testAssertNull() {
        assertNull("should be null", null);
    }

    // checks that an object is not null
    @SuppressWarnings("ObviousNullCheck")
    @Test
    public void testAssertNotNull() {
        assertNotNull("should not be null", new Object());
    }

    @SuppressWarnings("UnnecessaryBoxing")
    @Test
    public void testAssertSame() {
        Integer a = Integer.valueOf(62);
        assertSame("should be same", a, a);
    }

    @Test
    public void testAssertNotSame() {
        assertNotSame("should not be same Object", new Object(), new Object());
    }
}
