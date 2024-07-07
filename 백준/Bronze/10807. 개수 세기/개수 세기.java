import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = input.nextInt();
        }
        
        int v = input.nextInt();
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (num[i] == v) {
                count++;
            }
        }
        System.out.println(count);
        
        input.close();
    }
}