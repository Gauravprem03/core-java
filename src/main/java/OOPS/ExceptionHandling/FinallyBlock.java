package OOPS.ExceptionHandling;

public class FinallyBlock
{
    static void meth1() throws Exception
    {
        try
        {
            throw new Exception();
        }
        finally
        {
             System.out.println("Final Message");
        }
    }
    public static void main(String[] args) throws Exception
    {
        meth1();
    }
}
