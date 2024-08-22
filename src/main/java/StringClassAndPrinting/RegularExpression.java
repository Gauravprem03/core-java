package StringClassAndPrinting;

public class RegularExpression {
    public static void main(String[] args)
    {
        int b=1000110;
        int c=18000110;
        String str2= String.valueOf(c);
        String str=String.valueOf(b);
        System.out.println(str.matches("[01]+"));
        System.out.println(str2.matches("[01]+"));

        String str3="234AB";
        System.out.println(str3.matches("[0-9A-f]+"));
    }
}
