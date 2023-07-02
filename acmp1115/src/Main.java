import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int nPeoples = in.nextInt();
        int nApples = in.nextInt();
        out.println(nApples / nPeoples + " " + nApples % nPeoples + " " + (nPeoples - nApples % nPeoples) % nPeoples);
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
