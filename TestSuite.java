import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestCalculate.class,
        TestDifference.class,
        TestDivide.class
})
public class TestSuite {
}
