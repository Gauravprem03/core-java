package OOPS.classes;

class circle
{
    public double radius;
    public double Area()
    {
        return Math.PI*radius*radius;
    }
    public double Perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double Circumference()
    {
        return Perimeter();
    }
}


public class Circle1 {
    public static void main(String[] arg)
    {
        circle c1=new circle();
        circle c2=new circle();
        c1.radius=7;
        c2.radius=14;
        System.out.println("Area Is"+c1.Area());
        System.out.println("Perimeter Is"+c1.Perimeter());
        System.out.println("Circumference Is"+c1.Circumference());
        System.out.println("Area2 Is"+c2.Area());
        System.out.println("Perimeter2 Is"+c2.Perimeter());
        System.out.println("Circumference2 Is"+c2.Circumference());
    }

}


