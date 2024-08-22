package OOPS.ExceptionHandling;

public class FinalBlock {
    public static void main(String[] args)
    {
       try
       {
           System.out.println(50/0);
       }
       catch (ArithmeticException e)
      {
            System.out.println(e);
       }
       finally
       {
         System.out.println("Final Message");
       }
    }
}
