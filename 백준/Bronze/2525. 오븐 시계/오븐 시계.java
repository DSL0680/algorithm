import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int d = a + (b + c) / 60;
        int e = (b + c) % 60;
        
        d %= 24;
        
        System.out.println(d + " " + e);

        scanner.close();
    }
}