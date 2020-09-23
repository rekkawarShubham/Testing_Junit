import org.junit.*;


public class TestCalculate {

    Calculate cal = new Calculate();

    @Test
    public void testSum(){
        System.out.println("testSum getting executed");
        Calculate calc =new Calculate();
        int a = 4;
        int b = 5;
        int expected = 9;
        int actual = calc.sum(a,b);
        Assert.assertEquals(expected,actual);
    }

    @Before
    public void runBeforeEveryTest(){
        System.out.println("method associated with @before annotation");
    }
    @After
    public void runAfterEveryTest(){
        System.out.println("method associated with @after annotation");
    }
    @BeforeClass
    public static void runBeforeClass(){
        System.out.println("method associated with @BeforeClass annotation");
    }
    @AfterClass
    public static void runAfterClass()
    {
        System.out.println("method associated with @AfterClass annotation");
    }

    @Ignore
    public void testDivide() {
        double a = 78;
        double b = 10;
        double expectedResult = 7.8;
        double result = cal.div(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
        System.out.println("testDevide sucessfull");
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        double a = 15;
        double b = 0;
        cal.div(a, b);
        System.out.println("Divide by zero error");
    }
}
