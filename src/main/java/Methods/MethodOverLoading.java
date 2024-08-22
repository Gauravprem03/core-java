package Methods;

public class MethodOverLoading {
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static float max(float a, float b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }
    int max(int x,int y,int z)
    {
        if(x>y&&x>z)
        return x;
        else if(y>z)
            return y;
        else
            return z;
    }


    public static void main(String[] args) {
        System.out.println(max(10.5f, 20.5f));
        MethodOverLoading s2=new MethodOverLoading();
        System.out.println(s2.max(10, 20,30));
    }
}

       /* int x=10.5f;
         int y=20.5f;
        MethodOverLoading s1=new MethodOverLoading();
        System.out.println(s1.max(x,y));

        System.out.println(max(x,y));
        */



