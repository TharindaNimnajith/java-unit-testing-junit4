package v03_03;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        v03_03.MultiplyTest.class,
        v03_03.DivideTest.class,
        v03_03.CalculatorTest.class,
        v03_03.SubtractTest.class,
        v03_03.SumTest.class})
public class CalculatorSuite {
}
