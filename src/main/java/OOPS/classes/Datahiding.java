package OOPS.classes;
class Datahiding1 {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double l)
    {
        if(l>=0)
        length = l;
        else
            length=0;
    }

    public void setBreadth(double b)
    {
        if(breadth>=0)
        breadth=b;
        else
            breadth=0;
    }

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

  public class Datahiding {
    public static void main(String[] args)
    {
        Datahiding1 r1 = new Datahiding1();
        r1.setLength(10);
        r1.setBreadth(15);
        System.out.println("Area Is "+r1.Area());
        System.out.println("Perimeter Is "+r1.perimeter());
        System.out.println("It Is a Square "+r1.isSquare());

        System.out.println("Length Is "+r1.getLength());
        System.out.println("Breadth Is "+r1.getBreadth());
    }
}

