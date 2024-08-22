package OOPS.StaticAndFinal;


public class StsticBlock {
    static
    {
        System.out.println("Block 1st");
    }
    public static void main(String[]args)
    {
       System.out.println("Print Main");
    }
    static
    {
        System.out.println("Block 2nd");
    }
}
