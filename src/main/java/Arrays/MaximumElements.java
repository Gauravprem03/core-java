package Arrays;

import java.util.Scanner;

public class MaximumElements {
    public static void main(String[] args)
    {
        int A[]={10,20,30,40,50,60,70,80,90};
       int max=0;
       for (int i=0;i<A.length;i++)
       {
           if(A[i]>max)
           {
               max=A[i];
           }
       }
       System.out.println("Maximum Value Is "+max);

    }
}
