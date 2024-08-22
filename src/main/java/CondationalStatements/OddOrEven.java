package CondationalStatements;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args)
    {
        int Numbers;
        System.out.println("Enter The Numbers");
        Scanner s1= new Scanner(System.in);
        Numbers= s1.nextInt();

        if (Numbers%2==0)
        {
            System.out.println("This Is Even Numbers");
        }
        else
        {
            System.out.println("This Is Odd Numbers");
        }
    }
}
