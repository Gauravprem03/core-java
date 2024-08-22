package CondationalStatements;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String args[])
    {
        int a;
        System.out.println("Enter The Value Of A");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();
        if(a>=0)
        {
            System.out.println("Positive Numer");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }

}
