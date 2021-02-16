import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
            System.out.println("Leap");
        else
            System.out.println("Regular");
    }
}