import java.util.Scanner;

public class ContestStart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        long ans, n, p, d, z;
        while (t-- > 0) {
            n = in.nextLong();
            p = in.nextLong();
            d = in.nextLong();
            z = d / p;
            if (z > n)
                ans = (n - 1) * n / 2;
            else {
                ans = z * n;
                ans -= z * (z + 1) / 2;
            }
            System.out.println(ans);
        }
    }
}
