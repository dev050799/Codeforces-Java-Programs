import java.util.Scanner;

public class CoinRows {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int z = in.nextInt();
        int n = 2, m, s, p, i, j, sum;
        while (z > 0) {
            m = in.nextInt();
            int[][] a = new int[n][m];
            s = 0;
            p = 0;
            sum = Integer.MAX_VALUE;
            for (i = 0; i < 2; i++) {
                for (j = 0; j < m; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            for (j = 0; j < m; j++) {
                p = p + a[0][j];
            }
            for (j = 0; j < m; j++) {
                p -= a[0][j];
                if (s > p) {
                    if (s < sum)
                        sum = s;
                    else
                        sum = sum;
                } else {
                    if (p < sum)
                        sum = p;
                    else
                        sum = sum;
                }
                s += a[1][j];
            }
            System.out.println(sum);
            z--;
        }
    }
}