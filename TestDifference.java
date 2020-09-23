import org.junit.Assert;
import org.junit.Test;

public class TestDifference {
    @Test
    public void testDiff(){
        System.out.println("testDiff getting executed");
        //arange
        Calculate calc =new Calculate();
        int a=6;
        int b=5;
        int expected =1;
        //act
        int actual = calc.diff(a,b);
        //assert
        Assert.assertEquals(expected,actual);
    }
}
