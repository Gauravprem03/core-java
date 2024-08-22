package OOPS.classes;

class student1
{
    public int rollNo;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)total()/3;
    }
    public char grade()
    {
       if(average()>=60)
           return 'A';
       else
           return 'B';
    }
    public  String details()
    {
        return "Roll No:"+rollNo+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }

}

public class Student {
    public static void main(String[] args) {
        student1 s1 = new student1();
        s1.rollNo = 1;
        s1.name= "Prem";
        s1.course = "CSE";
        s1.m1 = 70;
        s1.m2 = 80;
        s1.m3 = 65;
        System.out.println("Total: " + s1.total());
        System.out.println("Average Is :" + s1.average());
        System.out.println("Details:\n"+s1.details());
    }
}
