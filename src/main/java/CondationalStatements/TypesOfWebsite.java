package CondationalStatements;

import java.util.Scanner;

public class TypesOfWebsite {
    public static void main(String []args)
    {
        String domain;
        System.out.println("Enter Domain Name");
        Scanner s1=new Scanner(System.in);
        domain=s1.nextLine();

        String ext=domain.substring(domain.lastIndexOf(".")+1);

        switch(ext)
        {
            case "com": System.out.println("Commercial");
            break;
            case "org": System.out.println("Organisation");
            break;
            case "gov": System.out.println("Government");
            break;
            case"net":System.out.println("Netwok");
            break;
        }


    }

}
