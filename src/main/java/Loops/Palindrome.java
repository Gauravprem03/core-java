package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int m=n;
        int rev=0;
        int r;

        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
       if(rev==m)
           System.out.println("Its a Palindrome");
       else
           System.out.println("Its Not a Palindrome");
    }
}
