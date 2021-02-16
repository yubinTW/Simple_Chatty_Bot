import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int prev = scanner.nextInt();
        int current = scanner.nextInt();
        boolean isASC = prev <= current;
        boolean isDESC = prev >= current;

        while (scanner.hasNext()) {
            current = scanner.nextInt();
            if (current == 0) {
                break;
            }
            if (isASC && current < prev) {
                isASC = false;
            }
            if (isDESC && current > prev) {
                isDESC = false;
            }
            prev = current;

        }
        System.out.println(isASC || isDESC);

    }
}