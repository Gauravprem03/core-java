package CondationalStatements;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args)
    {
        int month;
        System.out.println("Eter The Month Numbers");
        Scanner s1=new Scanner(System.in);
        month=s1.nextInt();
        switch (month)
        {
            case 1:System.out.println("Jan");
            break;
            case 2: System.out.println("Feb");
            break;
            case 3:System.out.println("March");
            break;
            case 4:System.out.println("April");
            break;
            case 5:System.out.println("may");
            break;
            case 6:System.out.println("June");
            break;
            case 7:System.out.println("july");
            break;
            case 8:System.out.println("August");
            break;
            case 9:System.out.println("September");
            break;
            case 10:System.out.println("October");
            break;
            case 11:System.out.println("November");
            break;
            case 12:System.out.println("December");
            break;
            default :System.out.println("Its Not A Month Number");
            break;

        }

    }
}
