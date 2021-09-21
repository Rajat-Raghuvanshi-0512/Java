import java.util.Scanner;

public class _9_Conditionals {
    public static void main(String[] args) {

        // if-else
        int a = 29;
        if (a > 18) {
            System.out.println("You can drive");
        } else {
            System.out.println("You are underage!");
        }

        // Switch-case
        Scanner S = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = S.next();
        S.close();
        // Normal switch
        switch (name) {
            case "Rajat":
                System.out.println("You are a good boy");
                System.out.println("Have a good life!");
                break;
            case "Mohit":
                System.out.println("You are a bad boy");
            default:
                System.out.println("You are a smart boy");
                break;
        }
        // Enhanced switch
        switch (name) {
            case "Rajat" -> {
                System.out.println("You are a good boy");
                System.out.println("Have a good life!");
            }
            case "Mohit" -> System.out.println("You are a bad boy");
            default -> System.out.println("You are a smart boy");
        }
    }
}
