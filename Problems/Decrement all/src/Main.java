import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        while (scanner.hasNext()) {
            System.out.printf("%d", scanner.nextInt() - 1);
            if (scanner.hasNext())
                System.out.printf(" ");
        }
    }
}