import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int s1 = in.nextInt();
        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int s2 = in.nextInt();
        out.println(getSeconds(h2, m2, s2) - getSeconds(h1, m1, s1));
    }

    void run() {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    private int getSeconds(int h, int m, int s) {
        return h * 3600 + m * 60 + s;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
