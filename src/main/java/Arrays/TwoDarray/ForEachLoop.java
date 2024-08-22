package Arrays.TwoDarray;

public class ForEachLoop {
    public static void main(String[] args) {
        int A[][] = new int[5][5];
        int B[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int x[] : B) {
            for (int y : x) {
                System.out.print(y+" ");
            }
            System.out.println(" ");
        }
    }
}