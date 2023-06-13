package archive;

import java.io.PrintWriter;
import java.util.Scanner;

public class NonDeafPhone {

    void solve(Scanner in, PrintWriter out) {
        int result = in.nextInt();
        out.println(result);
    }

    void run() {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new NonDeafPhone().run();
    }
}
