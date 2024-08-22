package OOPS.ExceptionHandling;

public class NestedCatch {
    public static void main(String[] args)
    {
        int A[]={30,20,10,0};
         try
         {
             int c = A[0] / A[2];
             System.out.println("Division Is" + c);
             System.out.println(A[5]);
         }
         catch(ArithmeticException e)
         {
             System.out.println("Number Must be >0");
         }
         catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index Is Invalid");
        }
         System.out.println("End Of  The Program");
    }
}
