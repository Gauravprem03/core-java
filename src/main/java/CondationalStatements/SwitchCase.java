package CondationalStatements;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String [] args)
    {
        int day;
        System.out.println("Eter Days NUmber");
        Scanner s1=new Scanner(System.in);
        day=s1.nextInt();

        switch(day)
        {
            case 1:System.out.println("Today Is Monday");
            break;
            case 2:System.out.println("Today Is Tuesday");
            break;
            case 3:System.out.println("Today Is Wednesday");
            break;
            case 4:System.out.println("Today Is Thursday");
            break;
            case 5:System.out.println("Today Is Friday");
            break;
            case 6:System.out.println("Today Is Saturday");
            break;
            case 7:System.out.println("Today Is Sunday");
            break;
            default : System.out.println("Its Not a Day Numbers");
        }
    }
}
