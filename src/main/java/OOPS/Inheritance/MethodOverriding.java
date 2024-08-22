package OOPS.Inheritance;

class Super
{
    public void display()
    {
        System.out.println("Super Class  Display");
    }
}
class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub Class Display");
    }
}
public class MethodOverriding {
    public static void main(String[] args)
    {
       Super sup =new Super();
       sup.display();

       Sub s=new Sub();
       s.display();
       System.out.println("Dynamic Method Display");
       Super sup1=new Sub();
       sup1.display();

    }
}
