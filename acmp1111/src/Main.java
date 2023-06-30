import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        String number = in.nextLine();
        out.println(Integer.parseInt(number) > 9 ? Integer.parseInt(String.valueOf(number.charAt(number.length() - 2))) : 0);

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
