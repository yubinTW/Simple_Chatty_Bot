import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        switch (str) {
            case "rectangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                double r = scanner.nextDouble();
                System.out.println(3.14 * Math.pow(r, 2));
                break;
            case "triangle":
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                double z = scanner.nextDouble();
                double s = (x + y + z) / 2;
                System.out.println(Math.sqrt(s * (s - x) * (s - y) * (s - z)));
                break;
        }
    }
}