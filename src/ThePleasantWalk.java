import java.util.Arrays;
import java.util.Scanner;

public class ThePleasantWalk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        int[] res = new int[n];
        Arrays.fill(res, 1);
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                continue;
            }
            res[i] += res[i - 1];
        }
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, res[i]);
        }
        System.out.println(max);
    }
}
