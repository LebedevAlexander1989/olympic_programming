import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int count = k / n;
        int o = k % n;
        out.println(count + " " + o);
        // вычислить количество обделенных яблоками
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
