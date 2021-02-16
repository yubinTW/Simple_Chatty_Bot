import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                System.out.println(i);
            }
        }
    }
}