import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long ans = 1L;
        for (long i = a; i < b; i++) {
            ans *= i;
        }
        System.out.println(ans);
    }
}
