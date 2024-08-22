package Loops;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args)
    {
        int i;
        //int n;
        int sum=0;
        System.out.println("Enter No To Add");
        Scanner s1= new Scanner(System.in);
       int n=s1.nextInt();
        for(i=1;i<=n;i++)
        {
            //System.out.println(i+"+"+n+"="+(n+i));
            System.out.println(i+"+"+sum+"="+(sum=sum+i));
            System.out.println("Sum Is "+sum);
        }
        System.out.println("Total Sum Is "+sum);
    }
}
