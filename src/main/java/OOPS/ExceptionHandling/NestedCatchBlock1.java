package OOPS.ExceptionHandling;

public class NestedCatchBlock1 {
    public static void main(String[]args)
    {
        int A []= new int[]{50, 40, 30, 20, 10, 5,0};

        try
        {
            int c=A[0]/A[6];
            System.out.println("Division Is"+c);
            try
            {
                System.out.println(A[8]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index Is Invalid");
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Denominator Should not Be 0");
        }
        System.out.println("End Program");

    }
}
