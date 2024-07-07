import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 바구니의 개수 N과 공의 교환 횟수 M 입력
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 바구니에 들어있는 공의 번호를 저장하는 배열
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1; // 바구니에 초기에는 바구니의 번호와 같은 번호가 들어있음
        }

        // 공을 교환하는 과정
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt() - 1; // 바구니의 번호를 0부터 시작하도록 변환
            int b = scanner.nextInt() - 1;

            // 바구니 a와 b에 들어있는 공을 서로 교환
            int temp = baskets[a];
            baskets[a] = baskets[b];
            baskets[b] = temp;
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
