import java.util.Arrays;
import java.util.Scanner;

public class NumberOfPairs {

    public static int lowerBound(int[] array, int length, int value) {
        int low = 0;
        int high = length;
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value <= array[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int upperBound(int[] array, int length, int value) {
        int low = 0;
        int high = length;
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l, r, t;
        int n, i, i1, i2, ans;
        int a[];
        t = in.nextInt();

        while (t-- > 0) {
            n = in.nextInt();
            l = in.nextInt();
            r = in.nextInt();
            a = new int[n];
            ans = 0;
            for (i = 0; i < n; i++)
                a[i] = in.nextInt();
            Arrays.sort(a);
            for (i = 0; i < n; i++) {
                i1 = lowerBound(a, n, l - a[i]);
                i2 = upperBound(a, n, r - a[i]);
                ans += i2 - i1-1;
            }
            System.out.println(ans);
        }


    }
}
