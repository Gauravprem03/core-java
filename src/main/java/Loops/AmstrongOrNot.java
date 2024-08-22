package Loops;

import java.util.Scanner;

public class AmstrongOrNot {
    public static void main(String[] args)
    {
        System.out.println("Enter The Number");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        int m=n;
        int sum=0;
        int r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(sum==m)
            System.out.println("Its A Amstrong Number");
        else
            System.out.println("It Is Not A Amstrong Number");

    }
}
