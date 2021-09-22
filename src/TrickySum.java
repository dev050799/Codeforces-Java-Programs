import java.util.Scanner;

public class TrickySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a, sum, num, sum2;
        while (n > 0) {
            sum = 0;
            a = in.nextInt();
            sum = a * (a + 1) / 2;
            num = 1;
            sum2 = 0;
            while (num <= a) {
                sum2 += num;
                num *= 2;
            }
            sum = sum - (sum2 * 2);
            System.out.println(sum);
            n--;
        }
    }
}
