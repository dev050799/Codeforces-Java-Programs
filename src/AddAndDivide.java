import java.util.Scanner;

public class AddAndDivide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            long a, b, ans = Integer.MAX_VALUE, count;
            a = in.nextLong();
            b = in.nextLong();
            for (long i = 0; i * i <= a; i++) {
                if (b == 1 && i == 0)
                    continue;
                count = i;

                long c = a;

                while (c > 0) {
                    c /= (b + i);
                    count++;
                }
                ans = Math.min(ans, count);
            }
            System.out.println(ans);
        }
    }
}

