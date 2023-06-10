package archive;

import java.io.PrintWriter;
import java.util.Scanner;

public class DominoStacking {

    void solve(Scanner in, PrintWriter out) {
        int left = in.nextInt();
        int right = in.nextInt();
        out.println(left * right / 2);
    }

    void run() {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new DominoStacking().run();
    }
}
