package Arrays.TwoDarray;

public class SortingArrayOfString {
    public static void main(String[] args)
    {
        String str[]={"java","python","pascal","smalltalk","ada","basic"};
        java.util.Arrays.sort(str);

        for(int i=0;i< str.length;i++)
        {
            System.out.println(str[i]+" ");
        }

        System.out.println("For Each Loop::::::");

        for(String X:str)
        {
            System.out.println(X);
        }
    }
}
