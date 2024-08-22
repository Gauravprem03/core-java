package OOPS.StaticAndFinal;

class test
{
    static int x=10;
    int y=20;

    void show()
    {
        System.out.println(x+" "+y);
    }
    static void display()
    {
        System.out.println(x);
    }
}

public class StaticMembers {
    public static void main(String[]arg)
    {
       test t1 = new test();
       t1.show();

       t1.x=30;
       t1.y=70;

       test t2 =new test();
       t2.show();
    }

}
