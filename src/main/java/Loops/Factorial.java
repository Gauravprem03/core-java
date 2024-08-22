package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        System.out.println("Enter The Number");
        Scanner s1= new Scanner(System.in);
        int n=s1.nextInt();

        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of This Number Is "+fact);

    }
}
