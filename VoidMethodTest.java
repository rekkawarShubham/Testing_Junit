import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class VoidMethodTest {

    private VoidMethodClass lstPersons = new VoidMethodClass();

    @Before
    public void initialize(){
        lstPersons.add("Shubham");
        lstPersons.add("Surya");
        lstPersons.add("MAX");
    }

    @After
    public void destroy(){
        lstPersons.removeAll();
    }

    @Test
    public void testSizeMethod(){
        int expected = 3;
        Assert.assertEquals(expected,lstPersons.size());
    }
    @Test
    public void testAddMethod(){
        lstPersons.add("Sai");
        int expected = 4;
        Assert.assertEquals(expected,lstPersons.size());
    }
    @Test
    public void testRemoveMethod(){
        lstPersons.remove("Surya");
        int expected = 2;
        Assert.assertEquals(expected,lstPersons.size());
    }
    @Test(expected = NoSuchElementException.class)
    public void testRemoveMethodForException(){
        lstPersons.remove("Sai");
        int expected=2;
        Assert.assertEquals(expected,lstPersons.size());
    }

}