package archive;

import java.io.PrintWriter;
import java.util.Scanner;

public class Enya {

    void solve(Scanner in, PrintWriter out) {
        int panels = in.nextInt();
        int left = in.nextInt();
        int right = in.nextInt();
        int result = panels * left * right * 2;
        out.println(result);
    }

    void run() {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Enya().run();
    }
}
