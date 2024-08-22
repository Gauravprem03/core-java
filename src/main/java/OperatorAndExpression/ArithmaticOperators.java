package OperatorAndExpression;

public class ArithmaticOperators {

    public static void main(String[] args)
    {
        int a=14;
        int b=5;

        int divide=a/b;
        float Divide=(float)a/b;
        int mod=a%b;

        System.out.println(divide);
        System.out.println(Divide);
        System.out.println(mod);

        float f=14.3f,g=3.2f;
        float r=f%g;
        System.out.println(r);

        byte by=10;
        short s=20;
        //byte z=by+s;
       // short z=by+s;
        int z=by+s;

        System.out.println(z);

        float fl=13.7f;
        long lo=1231;
        float c=fl*lo;
        System.out.println(c);

        char ch=100;
        int in=20;
        int d=ch-in;
        //char e=ch-in;
        System.out.println(d);


    }


}
