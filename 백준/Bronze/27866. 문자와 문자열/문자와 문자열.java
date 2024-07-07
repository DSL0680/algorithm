import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.nextLine();
        int i = scanner.nextInt();
        
        char result = S.charAt(i - 1);
        System.out.println(result);
        
    }
}