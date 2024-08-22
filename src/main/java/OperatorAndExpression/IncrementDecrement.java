package OperatorAndExpression;

public class IncrementDecrement {
    public static void main(String[] args)
    {
        int a=10;
        a++;
        System.out.println(a);
        int b=20;
        ++b;
        System.out.println(b);
        int c=a+b;
        System.out.println(c);

        int x=5,y;
        y=x++;
        //First assignment is done
        System.out.println(x+" "+y);

        int i=5,j;
        j=++i;
        System.out.println(i+" "+j);

        int k=5,l=10,m;
        m=2*k++ + 3* ++l;
        System.out.println(m);

        float p=5.5f;
        p++;
        System.out.println(p);

        char q='A';
        q++;
        System.out.println(q);



    }
}
