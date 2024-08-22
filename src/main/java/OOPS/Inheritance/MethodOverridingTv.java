package OOPS.Inheritance;

class Tv
{
    public void switchOn()
    {
        System.out.println("TV Is Switched On");
    }
    public void changeChannel()
    {
        System.out.println("TV Channel Is Change");
    }
}
class SmartTv extends Tv
{
    public void switchOn()
    {
        System.out.println("SmartTV Is Switched On");
    }
    public void changeChannel()
    {
        System.out.println("SmartTV Channel Is Change");
    }
    public void Browser()
    {
        System.out.println("Smart Tv Browsing");
    }
}

public class MethodOverridingTv {
    public static void main(String[]args)
    {
       /* Tv t = new Tv();
        t.changeChannel();
        t.switchOn();
        */
        Tv st= new SmartTv();
        //st.Browser();
        st.changeChannel();
        st.switchOn();
    }
}
