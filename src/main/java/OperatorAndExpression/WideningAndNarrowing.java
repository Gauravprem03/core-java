package OperatorAndExpression;

public class WideningAndNarrowing {
    public static void main(String[] args)
    {
        byte b=10;
        short s=10;
        int i=10;
        long l=10;
        float f=10;
        double d=10;
        char c=10;
        boolean b1=true;

        //b=s;
        s=b;
        i=b;
        l=b;
        //c=b;
       // i=f;
        f=i;
    }
}
