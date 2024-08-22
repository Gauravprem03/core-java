package Arrays;

public class FindingSecondLargestElement {
    public static void main(String[]args)
    {
        int B[]={10,20,30,40,50,60,70,80,90};
        int max1;
        int max2;
        max1=max2=B[0];
        for(int i=0;i<B.length;i++)
        {
            if(B[i]>max1)
            {
                max2=max1;
                max1=B[i];
            }
            else if(B[i]>max2)
            {
                max2=B[i];
            }
        }
        System.out.println("Second Largest Number Is "+max2);

    }
}
