package OOPS.Interfaces;

class Phone
{
public void call() { System.out.println("Phone call"); }
public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }

    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }

}
public class InterfaceDmoPhone {
    public static void main(String[] args)
    {
        SmartPhone s1 =new SmartPhone();
        s1.call();
        s1.click();
        s1.click();

        //IMusicPlayer sp=new SmartPhone();
        //sp.play();
        //sp.stop();

    }
}
