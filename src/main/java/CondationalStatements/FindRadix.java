package CondationalStatements;

import java.util.Scanner;

public class FindRadix {
    public static void main(String [] args)
    {
        String number;
        System.out.println("Enter No. To Check Radix");
        Scanner s1= new Scanner(System.in);
        number =s1.nextLine();

        if (number.matches("[01]+"))
        {
            System.out.println("Binary Number Radix Is = 2");
        }
        else if(number.matches("[0-7]+"))
        {
            System.out.println("Octal Number Radix Is = 8");
        }
        else if(number.matches("[0-9]"))
        {
            System.out.println("Decimal Number Radix is = 10");
        }
        else if(number.matches("[0-9A-F]"))
        {
            System.out.println("Hexa Deciml Radix is = 16");
        }
        else
        {
            System.out.println("It Is Not A Numbers");
        }


    }
}
