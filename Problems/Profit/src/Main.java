import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();
        int y = 0;
        while (m < k) {
            m *= 1 + p / 100.0;
            y++;
        }
        System.out.println(y);
    }
}