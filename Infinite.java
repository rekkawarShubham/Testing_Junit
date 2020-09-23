import org.junit.Test;

public class Infinite {
    String msg = "Hello All";
    Message util = new Message(msg);

    @Test(timeout = 1000)
    public void testInfiniteMethod(){
        System.out.println("Infinite Method running...");
        util.printInfinite();
    }
}