import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        if (N == 4) {
            System.out.print("long int");
        } else {
            int longCount = N / 4;
            System.out.print("long");
            for (int i = 0; i < longCount - 1; i++) {
                System.out.print(" long");
            }
            System.out.print(" int");
        }
    }
}
