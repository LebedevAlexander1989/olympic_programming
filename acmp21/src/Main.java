import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int s1 = in.nextInt();
        int s2 = in.nextInt();
        int s3 = in.nextInt();

        int min = Math.min(Math.min(s1, s2), s3);
        int max = Math.max(Math.max(s1, s2), s3);

        out.println(max - min);
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
