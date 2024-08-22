package OOPS.InnerClasses;
class outer2
{
    int x=10;
    static int y=20;
    static class my
    {
        public void show()
        {
            System.out.println(y);
        }
    }
}

public class StaticInnerClass {
    public static void main(String[]args)
    {
      outer2.my m=new outer2.my();
      m.show();
    }
}
