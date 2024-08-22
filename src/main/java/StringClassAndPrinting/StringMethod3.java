package StringClassAndPrinting;

public class StringMethod3 {
    public static void main(String[]args)
    {
        String str1="pyramid";
        String str2="pyramid";
        System.out.println(str1==str2);

        System.out.println(str1.equals(str2));

        String st1="Gaurav";
        String st2="GaUrav";
        System.out.println(st1.equalsIgnoreCase(st2));

        String s1="Diamond";
        String s2= new String("Diamond");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
;}
