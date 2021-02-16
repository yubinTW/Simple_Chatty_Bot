import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int b = scanner.nextInt();
            if (b <= h) {
                System.out.printf("Will crash on bridge %d\n", i);
                break;
            } else if (i == n) {
                System.out.println("Will not crash");
            }
        }
    }
}