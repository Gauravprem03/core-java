package OOPS.Inheritance;

class car
{
    public void Start()
    {
        System.out.println("Car Start");
    }
    public void Accelerate()
    {
        System.out.println("Car Is Accelerate");
    }
    public void ChangeGear()
    {
        System.out.println("Car Gear Change");
    }
}
class LuxaryCar extends car
{
    public void ChangeGear()
    {
        System.out.println("Automatic Gear");
    }
    public void openRoof()
    {
        System.out.println("Sun Roof Is Opened");
    }
}
public class MethodOverridingCar {
    public static void main(String[]arg)
    {
      /* car c=new car();
       c.Start();
       c.Accelerate();
       c.ChangeGear();
       */

       /* LuxaryCar c1=new LuxaryCar();
        c1.Start();
        c1.Accelerate();
        c1.ChangeGear();
        c1.openRoof();
        */
        car c1=new LuxaryCar();
        c1.Start();
        c1.Accelerate();
        c1.ChangeGear();
       // c1.openRoof();  Not allowed
    }


}
