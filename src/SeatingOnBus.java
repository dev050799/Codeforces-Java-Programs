import java.util.Scanner;

public class SeatingOnBus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b, n, m = 0, i, k, j, ck = 0, dk = 0, sum = 0, ln, ln2;

        n = in.nextInt();
        m = in.nextInt();
        for (j = 1; j <= 2 * n; j++) {
            if (2 * n + j <= m) {
                System.out.print((2 * n + j) + " ");
            }
            if (j <= m) {
                System.out.println(j + " ");
            }
        }

    }
}

