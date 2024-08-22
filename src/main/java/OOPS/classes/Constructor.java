package OOPS.classes;


class Dog
{
    private double length;
    private  double breadth;

    public Dog()
    {
        length=1;
        breadth=1;
    }
    public Dog(double l,double b)
    {
        setLength(l);
        setBreadth (b);
    }
    public Dog(double s)
    {
        length=breadth=s;
    }

    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }

    public  void setLength(double l)
    {
        if(l>=0)
            length=l;
        else
            length=0;
    }
    public  void setBreadth(double b)
    {
        if(b>=0)
            breadth=b;
        else
            breadth=0;
    }
    public  double area()
    {
        return getLength()*getBreadth();
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }

}
public class Constructor
{
    public static void main(String[]args)
    {
       Dog r1=new Dog(-10,-5);
        Dog r2=new Dog(10,5);
        Dog r3=new Dog();


       System.out.println("Area "+r3.area());
        System.out.println("Area "+r2.area());
        System.out.println("Area "+r1.area());

    }

}





