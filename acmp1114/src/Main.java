import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int v = in.nextInt();
        int t = in.nextInt();
        int r = (v * t);
        int m = r > 109 ? r - 109 - 1: 109 - r + 1;
        out.println(m);
        // посмотреть разбор
    }

    void run() {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
