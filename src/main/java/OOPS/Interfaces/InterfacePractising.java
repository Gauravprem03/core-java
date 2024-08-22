package OOPS.Interfaces;

interface Test
{
    void meth1();
    void meth2();
}
class my implements Test
{
    public void meth1()
    {
        System.out.println("Meth1 of class My");
    }
    public void meth2()
    {
        System.out.println("Meth2 of class my");
    }
    public void meth3()
    {
        System.out.println("Meth3 of class My");
    }

}

public class InterfacePractising {
    public static void main(String[]args)
    {
        /*Test t1=new my();
        t1.meth1();
        t1.meth2();
        //t1.meth3();
        */
        my m1=new my();
        m1.meth1();
        m1.meth2();
        m1.meth3();

    }



}
