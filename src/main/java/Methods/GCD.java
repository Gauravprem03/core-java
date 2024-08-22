package Methods;

public class GCD {

        static int gcd(int m,int n)
        {
            while(m!=n)
            {
                if(m>n)
                {
                    m=m-n;
                }
                else
                {
                    n=n-m;
                }
            }
            return m;
        }
    public static void main(String[] arg)
    {

        GCD x=new GCD();
        System.out.println(x.gcd(35,56));
        System.out.println(gcd(25,15));


    }

}
