import java.util.Scanner;

public class _17_MethodOverloading {

    static void greet() {
        System.out.println("Hey, Welcome");
    }

    static void greet(String name) {
        System.out.println("Hey, Welcome " + name);
    }

    static void greet(String name, String profession) {
        System.out.println("Hey, Welcome " + name + "(" + profession + ")");
    }

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        // Without any parameters
        greet();

        // With single parameter
        System.out.print("Enter your Name: ");
        String name = S.nextLine();
        greet(name);

        // With multiple parameters
        System.out.print("Enter your Name: ");
        String myname = S.nextLine();
        System.out.print("Enter your Profession: ");
        String profession = S.nextLine();
        greet(myname, profession);

        S.close();
    }
}
