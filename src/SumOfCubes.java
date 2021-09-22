import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long x = in.nextLong();
            long n = (long) Math.cbrt(x);
            int c = 0;
            for (int i = 1; i <= n; i++) {
                long a = (long) Math.cbrt(x - ((long) i * i * i));
                if(a==0){
                    continue;
                }
                if ((a * a * a) + ((long) i * i * i) == x) {
                    c = 1;
                    break;
                }
            }
            if (c == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
