import org.junit.Assert;
import org.junit.Test;

public class TestDivide {

    Calculate cal = new Calculate();
    @Test
    public void testDivide() {

        System.out.println("testDivide");
        double a = 78;
        double b = 10;
        double expectedResult = 7.8;
        double result = cal.div(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        System.out.println("Divide by zero ");
        double a = 15;
        double b = 0;
        cal.div(a, b);

    }
}
