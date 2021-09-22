import java.util.Scanner;

public class PleasantPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n, ans;
        long a[];
        while (t-- > 0) {
            n = in.nextInt();
            a = new long[n + 1];
            for (int i = 1; i < n + 1; i++)
                a[i] = in.nextLong();
            ans = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = (int)a[i] - i; j <= n; j += a[i]) {
                    if (i < j)
                        if (((a[i] * a[j]) == (i + j)))
                            ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
