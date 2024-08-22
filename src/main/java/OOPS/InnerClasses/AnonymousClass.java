package OOPS.InnerClasses;

abstract class my
{
    abstract public void show();
}
class outers
{
    public void display()
    {
        my m=new my()
        {
            public void show()
            {
                System.out.println("Hellooo");
            }
        };
        m.show();
    }
}

public class AnonymousClass {
    public static void main(String[]args)
    {
       outers o=new outers();
       o.display();
    }
}
