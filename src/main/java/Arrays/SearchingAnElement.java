package Arrays;

import java.util.Scanner;

public class SearchingAnElement {
    public static void main(String[] args)
    {
       // int A[]=new int[7];
       int A[]={2,4,6,8,10,12};
       int key;
       System.out.println("Enter Key Value");
       Scanner s1= new Scanner(System.in);
       key= s1.nextInt();


       for(int i=0;i<A.length;i++)
       {
           if(A[i]==key)
           {
               System.out.println("Found At Index "+i);
               System.exit(0);
           }
       }
        System.out.println("Key Is Not Found");
    }

}
