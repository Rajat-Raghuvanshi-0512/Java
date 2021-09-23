import java.util.Scanner;

public class _19_Recursion {

    // Ability of a function to call itself is called recursion.
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        System.out.print("Enter the number whose factorial you want to find: ");
        int number = S.nextInt();
        System.out.println(factorial(number));

        S.close();
    }
}
