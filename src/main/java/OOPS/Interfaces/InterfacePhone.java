package OOPS.Interfaces;

class phone
{
    public void call()
    {
        System.out.println("Phone Is Calling");
    }
    public void sms()
    {
        System.out.println("Phone Sending SMS");
    }
    interface iCamera
    {
        void click();
        void record();
    }
    interface Musicplayer
    {
        void play();
        void stop();
    }
    static class Smartphone extends phone implements iCamera , Musicplayer
    {
        public void videocall()
        {
            System.out.println("Smartphone video callin");
        }
        public void click()
        {
         System.out.println("Smart phone click photo");
        }
        public void record()
        {
           System.out.println("Smart phone recod video");
        }
        public void play()
        {
           System.out.println("Smartphone Play music");
        }
        public void stop()
        {
            System.out.println("Smartphone Musicstop");
        }
    }
}

public class InterfacePhone {
    public static void main(String[] args)
    {
        phone p1=new phone();
        p1.sms();
        p1.call();
        phone.Smartphone s1 = new phone.Smartphone();
        s1.record();
        s1.click();
        s1.play();
        phone p2=new phone.Smartphone();
        p2.call();




    }
}
