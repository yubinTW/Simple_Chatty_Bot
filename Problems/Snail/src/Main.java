import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int ans = (h - b) / (a - b);
        System.out.println((h - b) % (a - b) == 0 ? ans : ans + 1);
    }
}