package OOPS.AbstractClasses;

  abstract class super2
{
    public super2()
    {
        System.out.println("Super Constructor");
    }
    public void meth1()
    {
        System.out.println("meth1 Of Super");
    }
   abstract public void meth2();
}
class Sub extends super2
{
    public void meth2()
    {
        System.out.println("Sub Meth2");
    }
}
public class AbstractExample {
    public static void main(String[] arg)
    {
       super2 s2 =new Sub();
       s2.meth1();
       s2.meth2();
    }
}
