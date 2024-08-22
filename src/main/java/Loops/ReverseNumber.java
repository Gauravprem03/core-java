package Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] arg)
    {
        System.out.println("Enter a Number");
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int rev=0;
        int r;

        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse Number Is "+rev);
    }
}
