package OOPS.Inheritance;

class parent
{
    public parent()
    {
        System.out.println("Parent Constructor");
    }
}
class child extends parent {
    public child()
    {
        System.out.println("Child Constructor");
    }
}
class Grandchild extends child
    {
        public Grandchild()

        {
            System.out.println("Grand Child Constructor");
        }
}
public class Constructor1 {
    public static void main(String[] args)
    {
     // parent p1=new parent();
     // child c1= new child();
      Grandchild g1= new Grandchild();
    }
}
