import java.util.Scanner;

public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long loc = 1;
        long ans = 0;
        for (long i = 0; i < m; i++) {
            long now = in.nextLong();
            if (now >= loc)
                ans += now - loc;
            else
                ans += n - (loc - now);
            loc = now;
        }
        System.out.println(ans);
    }
}
