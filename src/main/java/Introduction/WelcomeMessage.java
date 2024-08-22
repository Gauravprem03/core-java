package Introduction;

import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        String name;
        System.out.println("May I Know Your Name");

        name= s.nextLine();
        System.out.println("Welcome Mr."+name);
    }
}
