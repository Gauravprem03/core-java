package Arrays.TwoDarray;

public class twoD {
    public static void main(String[] args) {
        int A[][] = new int[5][5];

        int B[][] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int C[][];
        C = new int[5][5];

        int[][] D = new int[5][5];
        int []E[]=new int[5][5];

        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[0].length;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.print("Length Of B "+B.length);







    }

}
