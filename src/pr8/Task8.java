package pr8;
import java.util.Scanner;

public class Task8 {
    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right)
        {
            return true;
        }
        if (s.charAt(left) != s.charAt(right))
        {
            return false;
        }
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        System.out.println("Введите слово" + '\n');
        String s = new Scanner(System.in).next();
        System.out.println(isPalindrome(s, 0, s.length() - 1) ? "YES" : "NO");
    }
}