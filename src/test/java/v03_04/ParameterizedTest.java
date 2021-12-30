package v03_04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class ParameterizedTest {
    private final int numA;
    private final int numB;
    private final int expected;

    // inject via constructor
    // for {8, 2, 10}, numA = 8, numB = 2, expected = 10
    public ParameterizedTest(int numA, int numB, int expected) {
        this.numA = numA;
        this.numB = numB;
        this.expected = expected;
    }

    // name attribute is optional, provide an unique name for test
    // multiple parameters, uses Collection<Object[]>
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {3, 2, 5},
                {4, 5, 9},
                {5, 5, 10},
                {6, 6, 12},
                {7, 8, 15}
        });
    }

    @Test
    public void testAddTwoNumbers() {
        assertThat(MathUtils.add(numA, numB), is(expected));
    }
}
