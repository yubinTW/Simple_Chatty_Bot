import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s.startsWith("J") || s.startsWith("j"));
    }
}