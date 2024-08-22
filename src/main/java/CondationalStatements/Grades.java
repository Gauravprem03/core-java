package CondationalStatements;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args)
    {
        int m1;
        int m2;
        int m3;
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter marks Of Physics");
        m1= s1.nextInt();
        System.out.println("Enter The Marks Of Chemistry");
        m2= s1.nextInt();
        System.out.println("Enter The Marks Of Maths");
        m3= s1.nextInt();
        int avg=(m1+m2+m3)/3;
        if (avg>=70)
        {
           System.out.println("Your Grade Is A");
        }
        else if(avg >=60 && avg<70)
        {
            System.out.println("Your Grade Is B");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.println("Your GradeIs C");
        }
        else if(avg >=40 && avg<50)
        {
            System.out.println("Your Grade Is D");
        }
        else if(avg>=30 && avg<40)
        {
            System.out.println("You Are Pass");
        }
        else
        {
            System.out.println("You Are FAil");
        }


    }
}
