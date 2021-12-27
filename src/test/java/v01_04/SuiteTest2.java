package v01_04;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("NewClassNamingConvention")
public class SuiteTest2 {
    @Test
    public void testPrintMessage() {
        String hello = "Hello World";
        System.out.println("Suite Test2 is executing");
        Assert.assertNotNull(hello);
        Assert.assertEquals("Hello World", hello);
    }
}
