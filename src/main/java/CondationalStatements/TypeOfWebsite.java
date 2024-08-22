package CondationalStatements;

import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args)
    {
        String url;
        System.out.println("Enter The URl");
        Scanner scan= new Scanner(System.in);
        url =scan.nextLine();
        String protocol=url.substring(0,url.indexOf(":"));

        if (protocol.equals("htpp"))
        {
            System.out.println("Hyper Text Transfer Protocol");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }
        else if(protocol.equals("https"))
        {
            System.out.println("Hyper Text Transfer Protocol Secure");
        }
        String ext=url.substring(url.lastIndexOf("."));
        if (ext.equals(".com"))
        {
            System.out.println("Its a Commercial Website");
        }
        else if(ext.equals(".gov"))
        {
            System.out.println("Its a Governent Website");
        }
        else if(ext.equals(".org"))
        {
            System.out.println("Its a Organisation Website");
        }




    }
}

