package OOPS.Inheritance;

class Supper
{
    public void method1()
    {
        System.out.println("Supper Method1");
    }
    public void method2()
    {
        System.out.println("Supper Method2");
    }
}
class subb extends Supper
{
    public void method2()
    {
        System.out.println("Subb Method2");
    }
    public void method3()
    {
        System.out.println("Subb Method3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args)
    {
     /*
      Supper s=new Supper();
      s.method1();
      s.method2();
     // s.method3();
      */
       /* subb s1=new subb();
        s1.method1();
        s1.method2();
        s1.method3();
        */
        Supper s2= new subb();
       // not allowed  subb s3=new Supper();
        s2.method1();
        s2.method2();

        //s2.method3();
    }
}
