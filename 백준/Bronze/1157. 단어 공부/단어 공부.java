import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toUpperCase(); // 입력 받은 단어를 모두 대문자로 변환

        int[] count = new int[26]; // 알파벳 개수를 저장할 배열

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isAlphabetic(ch)) { // 알파벳인 경우에만 카운트
                count[ch - 'A']++;
            }
        }

        int maxCount = -1; // 가장 많이 나온 알파벳의 개수
        char answer = '?'; // 가장 많이 나온 알파벳, 여러 개일 경우 '?'로 초기화

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                answer = (char) (i + 'A'); // 대응하는 알파벳으로 변환
            } else if (count[i] == maxCount) {
                answer = '?'; // 가장 많이 나온 알파벳이 여러 개일 경우 '?'
            }
        }

        System.out.println(answer);
    }
}
