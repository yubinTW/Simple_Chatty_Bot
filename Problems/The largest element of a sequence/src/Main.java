import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int max = scanner.nextInt();
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            if (x == 0)
                break;
            max = max < x ? x : max;
        }
        System.out.println(max);
    }
}