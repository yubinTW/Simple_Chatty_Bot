import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println((s.charAt(0) == s.charAt(3) && s.charAt(1) == s.charAt(2)) ? 1 : 0);
    }
}