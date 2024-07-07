import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = scanner.next();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (visited[currentChar - 'a']) { // 이미 방문한 문자인 경우
                if (word.charAt(i - 1) != currentChar) {
                    return false; // 현재 문자와 이전 문자가 다르면 그룹 단어가 아님
                }
            } else {
                visited[currentChar - 'a'] = true;
            }
        }

        return true;
    }
}
