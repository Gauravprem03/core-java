package OOPS.Inheritance;

import java.util.concurrent.locks.ReadWriteLock;

class Rectangle
{
    int length;
    int breadth;

    Rectangle()
    {
        length=1;
        breadth=1;
    }
    Rectangle(int l,int b)
    {
        length =l;
        breadth=b;
    }
}
class Cuboid extends Rectangle
{
    int height;

    Cuboid()
    {
        height=1;
    }
    Cuboid(int h)
    {
        height=h;
    }
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    int Volume()
    {
        return length*breadth*height;
    }
    int Radius()
    {
        return (int)Math.PI*length*breadth;
    }
}

public class ParameterizedConstructor {
    public static void main(String[]args)
    {
       Cuboid c1= new Cuboid();
       System.out.println(c1.Volume());

       System.out.println("After Given Parameter");
       Cuboid c2=new Cuboid(10);
        System.out.println(c2.Volume());

        System.out.println("...........");
        Cuboid c3=new Cuboid(5,10,15);
        System.out.println(c3.Volume());
        System.out.println("Radius Is "+c3.Radius());

    }
}
