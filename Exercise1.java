// Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.println("Enter marks scored in English: ");
        float marks1 = S.nextFloat();
        System.out.println("Enter marks scored in Maths: ");
        float marks2 = S.nextFloat();
        System.out.println("Enter marks scored in Science: ");
        float marks3 = S.nextFloat();
        System.out.println("Enter marks scored in Social Science: ");
        float marks4 = S.nextFloat();
        System.out.println("Enter marks scored in Hindi: ");
        float marks5 = S.nextFloat();

        float per;
        per = (marks1 + marks2 + marks3 + marks4 + marks5) / 5;
        System.out.println("Percentage: " + per + "%");

        S.close();
    }
}
