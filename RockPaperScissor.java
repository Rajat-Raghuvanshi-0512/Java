import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static int rand() {
        Random x = new Random();
        // Generates a random number including 1 and excluding 4
        int number = x.nextInt(1, 4);
        return number;
    }

    public static void GameOver(int User_choice, int Pc_choice) {
        if ((User_choice == 1 && Pc_choice == 3) || (User_choice == 2 && Pc_choice == 1)
                || (User_choice == 3 && Pc_choice == 2)) {
            System.out.println("You win!");
        } else if (Pc_choice == User_choice) {
            System.out.println("It's a draw!");
        } else {
            System.out.println("You lose!");
        }
    }

    public static void CheckUserChoice(int User_choice) {
        switch (User_choice) {
            case 1 -> System.out.println("You chose Rock");
            case 2 -> System.out.println("You chose Paper");
            case 3 -> System.out.println("You chose Scissors");
        }
    }

    public static void CheckPcChoice(int Pc_choice) {
        switch (Pc_choice) {
            case 1 -> System.out.println("Computer chose Rock");
            case 2 -> System.out.println("Computer chose Paper");
            case 3 -> System.out.println("Computer chose Scissors");
        }
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter 1 for Rock\nEnter 2 for Paper\nEnter 3 for Scissor");
        int User_choice = S.nextInt();
        int Pc_choice = rand();
        CheckUserChoice(User_choice);
        CheckPcChoice(Pc_choice);
        GameOver(User_choice, Pc_choice);
        S.close();
    }
}
