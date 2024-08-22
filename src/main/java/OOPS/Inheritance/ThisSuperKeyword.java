package OOPS.Inheritance;

class Rectangl
{
    int length;
    int breadth;
    int x=10;

    Rectangl(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
}

class Cuboid1 extends Rectangl
{
    int height;
    int x=20;

    Cuboid1(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}
public class ThisSuperKeyword
{
    public static void main(String[] args)
    {
      Cuboid1 c1=new Cuboid1(10,5,15);
      c1.display();
    }
}
