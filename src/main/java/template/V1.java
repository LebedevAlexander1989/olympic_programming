package template;

import archive.APlusB;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class V1 {

    void solve(Scanner in, PrintWriter out) {

    }

    void run() {
        try (Scanner in = new Scanner(new FileReader("sum.in"));
             PrintWriter out = new PrintWriter(new FileWriter("sum.out"))) {
            solve(in, out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}
