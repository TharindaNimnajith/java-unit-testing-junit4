package v02_03;

import org.junit.Test;
import v02_01.PrintGrade;

import static org.junit.Assert.assertEquals;

public class PrintGradeTest {
    @Test
    public void test() {
        PrintGrade pg = new PrintGrade();
        String result = pg.print(90);
        assertEquals("You got an A!", result);
    }
}
