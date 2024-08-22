package OOPS.classes;

class Rectangle1
{
    public double length;
    public double breadth;

    public double Area()
    {
        return  length*breadth;
    }
    public double perimeter()
    {
       return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        if (length==breadth)
            return true;
        else
            return false;
    }
}

public class Rectangle {
    public static void main(String[] args)
    {
      Rectangle1 r1 = new Rectangle1();
      r1.length=10;
      r1.breadth=15;
      System.out.println("Area Is "+r1.Area());
      System.out.println("Perimeter Is"+r1.perimeter());
        System.out.println("It Is a Square"+r1.isSquare());
    }
}
