package Arrays;

public class SumOfAllElements {
    public static void main(String [] args)
    {
        int A [] ={2,4,6,8,10,12,14};
       int  sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        //System.out.println(A[i]);
        System.out.println(sum);

        for(int x:A)
        {
            sum=sum+x;
        }
        System.out.println("Sum Is "+sum);

    }
}
