import java.util.Scanner;

public class _7_Strings {
    public static void main(String[] args) {
        // String name = new String("Rajat");
        String name = "Rajat";
        System.out.println(name);

        String uni = "Chandigarh University";

        System.out.printf("My name is %s and I am from %s \n", name, uni);
        // System.out.format("My name is %s and I am from %s \n", name, uni);
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
        sc.close();
    }
}
