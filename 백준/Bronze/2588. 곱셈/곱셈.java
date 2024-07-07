import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = num1 * num2;


        System.out.println(num1 * (num2 % 10));
        System.out.println(num1 * ((num2 / 10) % 10));
        System.out.println(num1 * (num2 / 100));
        System.out.println(result);

        scanner.close();
    }
}
