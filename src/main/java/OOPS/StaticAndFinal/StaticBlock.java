package OOPS.StaticAndFinal;
class test1
{
    static
    {
        System.out.println("Block 1");
    }
    static
    {
        System.out.println("Block 2");
    }
}

public class StaticBlock
{
    public static void main(String[]args)
    {

        System.out.println("Main");
        test1 t1=new test1();
    }
}
