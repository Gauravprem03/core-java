package OOPS.ExceptionHandling;

import java.util.Scanner;

public class HandleException {

    public static void main(String[] args)
    {
        int a=10,b,c;
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter Value Of b");
        b=s1.nextInt();

        try
        {
            c=a/b;
            System.out.println("Division Is"+ c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Number Must be >0.");
            System.out.println("Try Again ");

        }
        System.out.println("End");

    }
}
