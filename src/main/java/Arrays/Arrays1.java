package Arrays;

public class Arrays1 {
    public static void main(String[] args)
    {
        int A[] =new int [5];
        int B[]={2,4,6,8,10};
        int c[];
        c=new int[10];
        int [] D= new int[5];



        for(int i=0;i<A.length;i++)
        {
            System.out.println(B[i]);
        }
        B[2]=15;

        for(int x:B)
        {
            System.out.println(x);
        }
    }
}
