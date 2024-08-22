package Arrays.TwoDarray;

public class AddingTwoMatrices {
    public static void main(String[] arg)
    {
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
        int C[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");

        }
        System.out.println("Through ForEach Loop ");
        for(int X[]:C)
        {
            for(int y:X)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
