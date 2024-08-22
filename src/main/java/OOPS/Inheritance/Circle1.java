package OOPS.Inheritance;

class circle
{
    public double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}
class Cylinder extends circle
{
    public double height;
    public double volume()
    {
        return area()*height;
    }
}

public class Circle1 {
    public static void main(String [] args)
    {
        Cylinder c1= new Cylinder();
        c1.radius=7;
        c1.height=10;

        System.out.println("Volume Is "+c1.volume());
        System.out.println("Area Is "+c1.area());
        System.out.println("Perimeter Is "+c1.perimeter());
    }
}
