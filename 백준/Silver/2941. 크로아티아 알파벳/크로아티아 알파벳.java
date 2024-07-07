import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'c' && i < word.length() - 1) {
                if (word.charAt(i + 1) == '=' || word.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (ch == 'd' && i < word.length() - 1) {
                if (word.charAt(i + 1) == '-') {
                    i++;
                } else if (word.charAt(i + 1) == 'z' && i < word.length() - 2) {
                    if (word.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            } else if ((ch == 'l' || ch == 'n') && i < word.length() - 1) {
                if (word.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if ((ch == 's' || ch == 'z') && i < word.length() - 1) {
                if (word.charAt(i + 1) == '=') {
                    i++;
                }
            }
            count++;
        }

        System.out.println(count);
    }
}
