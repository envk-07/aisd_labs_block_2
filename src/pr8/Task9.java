package pr8;
import java.util.Scanner;

public class Task9 {
    public static int countSequences(int a, int b, boolean lastWasZero) {
        if (a < 0 || b < 0) return 0;
        if (a == 0 && b == 0) return 1;

        int count = 0;
        if (!lastWasZero) {
            count += countSequences(a - 1, b, true); // Ставим 0
        }
        count += countSequences(a, b - 1, false); // Ставим 1
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSequences(2, 2, false)); // Ответ: 5
    }
}