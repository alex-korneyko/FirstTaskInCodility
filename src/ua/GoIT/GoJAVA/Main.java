package ua.GoIT.GoJAVA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int value = 0;
        Solution Sol = new Solution();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input integer: ");
            try {
                value = scanner.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(Sol.solution(value));

        } while (value != 0);
    }
}
