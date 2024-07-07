import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" "); // 오른쪽으로 이동할 공백 출력
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*"); // 별 출력
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
