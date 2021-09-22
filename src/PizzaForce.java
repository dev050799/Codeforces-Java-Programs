import java.util.Scanner;

public class PizzaForce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long n, s, r, a;
        while (t-- > 0) {
            n = in.nextLong();
            s = n / 6;
            r = n % 6;
            if (n <= 6)
                a = 15;
            else if (r == 0)
                a = s * 15;
            else if (r != 0 && r <= 2)
                a = s * 15 + 5;
            else if (r != 0 && r <= 4)
                a = s * 15 + 10;
            else
                a = (s + 1) * 15;
            System.out.println(a);
        }
    }
}
