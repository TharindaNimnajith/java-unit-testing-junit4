package v02_01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintGradeTest {
    @Test
    public void test() {
        PrintGrade pg = new PrintGrade();
        String result = pg.print(95);
        assertEquals("You got a B!", result);
    }
}
