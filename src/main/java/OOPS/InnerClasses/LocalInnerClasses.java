package OOPS.InnerClasses;

class outer
{
    public void display()
    {
        class inner
        {
            public void show()
            {
                System.out.println("Hello");
            }
        }
        new inner().show();
        inner i=new inner();
        i.show();
    }
}

public class LocalInnerClasses {
    public static void main(String[]args)
    {
       outer o1=new outer();
       o1.display();
    }
}
