package Methods;

public class NotChanging {

    static void increment(int x)
    {
        x++;
        System.out.println(x);
    }

    public static void main(String [] arg)
    {
        int a=10;
        int b=30;
        increment(a);
        System.out.println(a);
    }
}
