import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        int a = System.in.read() - 48;
        System.in.read();
        System.out.print(a + System.in.read() - 48);
    }
}
