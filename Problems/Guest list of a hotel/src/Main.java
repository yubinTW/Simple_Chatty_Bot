//put imports you need here
import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList arr = new ArrayList();
        while(scanner.hasNext()) {
            arr.add(scanner.next());
        }
        for(int i =arr.size()-1;i>=0;i--) {
            System.out.println(arr.get(i));
        }
    }
}