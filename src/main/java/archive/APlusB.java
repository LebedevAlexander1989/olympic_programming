package archive;

import java.io.*;
import java.util.Scanner;

public class APlusB {

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int s = a + b;
        out.println(s);
    }

    void run() {
            try (Scanner in = new Scanner(System.in);
                 PrintWriter out = new PrintWriter(System.out)) {
                solve(in, out);
            }
        }

    public static void main(String[] args) {
        new APlusB().run();
    }
}
