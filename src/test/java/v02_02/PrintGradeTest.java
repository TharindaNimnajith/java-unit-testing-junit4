package v02_02;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import v02_01.PrintGrade;

import static org.junit.Assert.assertEquals;

public class PrintGradeTest {
    public PrintGradeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSomeMethod() {
        PrintGrade pg = new PrintGrade();
        String result = pg.print(90);
        assertEquals("Incorrect Message was received", "You got an A!", result);
    }
}
