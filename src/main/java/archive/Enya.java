package archive;

import java.io.PrintWriter;
import java.util.Scanner;

public class Enya {

    void solve(Scanner in, PrintWriter out) {
        int g = in.nextInt();
        int l = in.nextInt();
        String result = (10 - g) + " " + (10 - l);
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
