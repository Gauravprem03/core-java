package StringClassAndPrinting;

public class StringMethod2 {
    public static void main(String[] args)
    {
        String str1="Mr. Gaurav Prem";
        String str2="Mr. Gaurav Prem";

        System.out.println(str1.startsWith("Mr"));
        System.out.println(str2.startsWith("Ga",4));

        String str3="Mr. Gaurav Prem";
        System.out.println(str3.endsWith("s"));
        System.out.println(str3.charAt(4));

        for(int i=0;i<str3.length();i++)
        {
            System.out.print(str3.charAt(i));
        }

        String str4="www.udemy.co.in";
        System.out.println(str4.indexOf('.'));
        System.out.println(str4.lastIndexOf("."));
        System.out.println(str4.indexOf('.',4));
        System.out.println(str4.indexOf("udemy"));
    }
}
