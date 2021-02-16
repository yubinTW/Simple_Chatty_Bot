import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            max = (x % 4 == 0 && max < x) ? x : max;
        }
        System.out.println(max);
    }
}