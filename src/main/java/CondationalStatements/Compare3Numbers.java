package CondationalStatements;

import java.util.Scanner;

public class Compare3Numbers {
    public static void main(String args[])
    {
        int x=10;
        int y=20;
        int z=30;
        System.out.println(x>y);
        System.out.println(x>y && y<z);
        System.out.println(x>y || y<z);

        int a;
        System.out.println("Enter The Value Of A");
        Scanner s1= new Scanner(System.in);
         a= s1.nextInt();
        int b;
        System.out.println("Enter The Value Of B");
        Scanner s2= new Scanner(System.in);
         b= s2.nextInt();
        int c;
        System.out.println("Enter The Value Of C");
        Scanner s3= new Scanner(System.in);
        c= s3.nextInt();

        if(a>b && a>c)
        {
           System.out.println("MaX is A"+a);
        }
        else
        {
            if(b>c)
            {
                System.out.println("Max Is B  "+b);
            }
            else
            {
                System.out.println("Max Is C  "+c);
            }
        }
    }

}
