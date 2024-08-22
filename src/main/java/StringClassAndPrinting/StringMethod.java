package StringClassAndPrinting;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args)
    {
        String str1 = new String ("  GauravPrem  ");
        System.out.println(str1.length());
        System.out.println(str1);

        int len =str1.length();
        System.out.println(len);


       String str2= str1.toUpperCase();

        System.out.println(str2);

        String str3=str1.toLowerCase();
        System.out.println(str3);

        String str5= str1.trim();
        System.out.println(str1);
        System.out.println(str5);

        String str6= str1.substring(3);
        String str7= str1.substring(8,12);
        System.out.println(str6);
        System.out.println(str7);

        String str8= str1.replace('a','M');
        System.out.println(str1+"  "+str8);


    }
}
