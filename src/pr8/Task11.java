import java.util.Scanner;

public class Task11 {
    public static int countOnes() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x == 0) {
            int y = scanner.nextInt();
            if (y == 0) {
                return 0;
            }
            if (y == 1) return 1 + countOnes();
            else return 0 + countOnes();
        }

        if (x == 1) return 1 + countOnes();
        else return 0 + countOnes();
    }

    public static void main(String[] args) {
        System.out.println(countOnes());
    }
}