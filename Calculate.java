public class Calculate {
    public int sum(int a, int b){
        return a+b;
    }
    public int diff(int a, int b){
        return a-b;
    }
    public double div(double a ,double b) {
        if(b==0)
        {
            throw new IllegalArgumentException();
        }
        return a/b;
    }
}
