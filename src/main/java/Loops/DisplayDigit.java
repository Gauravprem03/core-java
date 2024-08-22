package Loops;

import java.util.Scanner;

public class DisplayDigit {
    public static void main(String[]args)
    {
        int n;
        Scanner s1=new Scanner(System.in);
          n=s1.nextInt();

          int r;

        while(n>0)
        {
            r=n%10;
            n=n/10;

            System.out.println(r);
        }
    }
}
