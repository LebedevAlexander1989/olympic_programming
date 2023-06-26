import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
       int elOne= in.nextInt();
       int elTwo = in.nextInt();
       int number = in.nextInt();
       int different = elTwo - elOne;
       int result = elOne;
       for (int i = 0; i < number - 1; i++) {
           result += different;
       }
       out.println(result);
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
