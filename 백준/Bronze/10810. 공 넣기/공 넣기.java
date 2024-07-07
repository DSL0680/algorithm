import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] baskets = new int[N];

        for (int i = 0; i < M; i++) {
            int start = scanner.nextInt() - 1;
            int end = scanner.nextInt() - 1;
            int ball = scanner.nextInt();
            Arrays.fill(baskets, start, end + 1, ball);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
