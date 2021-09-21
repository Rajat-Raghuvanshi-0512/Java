import java.util.Scanner;

public class _3_TakingInput {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        // System.out.print("Enter first number: ");
        // int a = S.nextInt();
        // System.out.print("Enter second number: ");
        // int b = S.nextInt();
        // int sum = a + b;
        // System.out.println("The sum is " + sum);

        System.out.println("Say something: ");
        String str = S.nextLine();
        System.out.println(str);
        S.close();
    }
}
