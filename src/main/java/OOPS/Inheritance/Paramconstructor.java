package OOPS.Inheritance;

class param
{
    param()
    {
        System.out.println("Non Param Of Parent");
    }
    param(int x)
    {
        System.out.println("Param Of Parent "+x);
    }
}
class chill extends param
{
    chill()
    {
       System.out.println("Non Param Of Child");
    }
    chill(int y)
    {
        System.out.println("Param of Child");
    }
    chill(int x,int y)
    {
        super(x);
        System.out.println("2 Param Of Child "+y);
    }
}

public class Paramconstructor {
    public static void main(String[] arg)
    {
       chill c =new chill();

       System.out.println(".......................");
       chill c1= new chill(20);

       System.out.println("...............");
       chill c2= new chill(10,20);
    }
}
