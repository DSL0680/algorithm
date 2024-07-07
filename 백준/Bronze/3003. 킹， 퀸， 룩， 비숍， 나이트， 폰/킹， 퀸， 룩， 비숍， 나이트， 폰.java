import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 흰색 피스의 개수 입력 받기
        int[] whitePieces = new int[6];
        for (int i = 0; i < 6; i++) {
            whitePieces[i] = scanner.nextInt();
        }
        
        // 올바른 흰색 피스의 개수
        int[] correctPieces = {1, 1, 2, 2, 2, 8};
        
        // 결과 계산 및 출력
        for (int i = 0; i < 6; i++) {
            System.out.print(correctPieces[i] - whitePieces[i] + " ");
        }
    }
}
