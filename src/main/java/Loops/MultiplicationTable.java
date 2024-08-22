package Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[]args)
    {
        int i;
        int n;
        System.out.println("Enter To Multiplication");
        Scanner s1= new Scanner(System.in);
        n=s1.nextInt();

        for(i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
        System.out.println("All Tables Are Printed");
    }
}
