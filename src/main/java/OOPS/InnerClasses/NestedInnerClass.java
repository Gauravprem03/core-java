package OOPS.InnerClasses;

class outer1
{
    int x=10;
    class inner
    {
        int y=20;
        public void innerdisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    public void outerdisplay()
    {
        inner i=new inner();
        i.innerdisplay();
        System.out.println(i.y);
    }
}


public class NestedInnerClass {
    public static void main(String[] args)
    {
       outer1 o =new outer1();
       o.outerdisplay();

    }
}
