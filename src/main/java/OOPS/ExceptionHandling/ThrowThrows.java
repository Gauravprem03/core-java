package OOPS.ExceptionHandling;

public class ThrowThrows
{
    static int met1()
    {
        return 10/0;
    }
    static void meth2()
    {
        met1();
    }
    static void meth3()
    {
        meth2();
    }
    public static void main(String[]args)
    {
        try
        {
            meth3();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
