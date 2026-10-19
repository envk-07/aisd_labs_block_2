package pr8;

import java.util.Scanner;

public class Task10 {
    public static int reverseNumber(int number, int reversedNum) {
        if (number == 0) {
            return reversedNum;
        }

        int lastDigit = number % 10;
        int newReversed = reversedNum * 10 + lastDigit;

        return reverseNumber(number / 10, newReversed);
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(reverseNumber(n, 0));
    }
}