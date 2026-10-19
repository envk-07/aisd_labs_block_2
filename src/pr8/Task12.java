package pr8;

import java.util.Scanner;

public class Task12 {
    public static void printOdds() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x == 0) {
            return;
        }

        if (x % 2 != 0) {
            System.out.println(x);
        }

        printOdds();
    }

    public static void main(String[] args) {
        printOdds();
    }
}