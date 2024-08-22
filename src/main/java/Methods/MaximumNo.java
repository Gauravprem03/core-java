package Methods;

public class MaximumNo {
    static int max(int x,int y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        System.out.println(max(a,b));

        //create object of this class,and call the method;;

        MaximumNo max1=new MaximumNo();
        System.out.println(max1.max(a,b));
    }
}
