import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int result = A + B;
        int result2 = A - B;
        int result3 = A * B;
        int result4 = A / B;
        int result5 = A % B;
        
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        
        scanner.close();
    }
}