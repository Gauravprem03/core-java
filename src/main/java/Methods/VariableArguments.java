package Methods;

public class VariableArguments {

    static void show(int...A)
    {
        for(int x:A)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args)
    {
        show();
        show(10,20,30,40);
        show(new int[]{3,5,7,9,11,13,15});
    }

}
