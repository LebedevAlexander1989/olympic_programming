import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int result = 0;
        String number = in.nextLine();
        for (int i = 0; i < number.length(); i++) {
            result += Integer.parseInt(String.valueOf(number.charAt(i)));
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
