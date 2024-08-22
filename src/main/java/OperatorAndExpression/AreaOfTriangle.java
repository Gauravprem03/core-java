package OperatorAndExpression;

import java.util.*;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args)
    {
        int area;
        int base;
        int height;
        System.out.println("Enter the Value Of Base ");
        Scanner s1= new Scanner(System.in);
        base=s1.nextInt();

        System.out.println("Enter the Value Of Height ");
        Scanner s2=new Scanner(System.in);
        height=s2.nextInt();

        area=base*height/2;
        System.out.println("Area Of Triangle" +area);

    }
}
