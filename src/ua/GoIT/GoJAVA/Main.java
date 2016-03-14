package ua.GoIT.GoJAVA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int value;
        Solution Sol = new Solution();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input integer (-1 for quit): ");

            try {
                value = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Incorrect input!");
                value=0;
            }

            System.out.println(Sol.solution(value));

        } while (value != -1);
    }
}
