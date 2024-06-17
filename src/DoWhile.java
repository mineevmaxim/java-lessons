import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            x = scanner.nextInt();
        } while (x != 5);
        System.out.println(x);
    }
}
