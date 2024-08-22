package CondationalStatements;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] arg)
    {
        System.out.println("MENU....");
        System.out.println("Add.");
        System.out.println("Subtract.");
        System.out.println("Divide.");
        System.out.println("Multiply.");

        System.out.println("Enter Two Numbers");
        Scanner s1=new Scanner(System.in);
        int x= s1.nextInt();
        int y=s1.nextInt();
        s1.nextLine();

        System.out.println("Enter Options Words ");
        String option=s1.nextLine();

        switch (option)
        {
            case"Add":System.out.println("Sum Is"+(x+y));
            break;
            case"Subtract":System.out.println("Subtract Is "+(x-y));
            break;
            case"Multiply":System.out.println("Multiply Is "+(x*y));
            break;
            case"Divide":System.out.println("Divide Is"+(x/y));
            break;
            default:System.out.println("Invalid Options");
            break;

        }

    }
}
