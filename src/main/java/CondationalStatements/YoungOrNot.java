package CondationalStatements;

import java.util.Scanner;

public class YoungOrNot {
    public static void main(String [] args)
    {
        int age;
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter Your Age");
        age=s1.nextInt();

        if(age>=18 && age<=45)
        {
            System.out.println("You Are Young");
        }
        else
        {
            System.out.println("You Are Not Young");
        }
    }

}
