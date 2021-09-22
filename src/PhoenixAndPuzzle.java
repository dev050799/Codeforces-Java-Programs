import java.util.Scanner;

public class PhoenixAndPuzzle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            if (n % 2 == 0) {
                if (sq(n / 2))
                    System.out.println("YES");
                else if (n % 4 == 0 && sq(n / 4))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else
                System.out.println("NO");
        }
    }

    private static boolean sq(int n) {

        int k = (int) Math.sqrt(n);
        if (Math.pow(k, 2) == n)
            return true;
        return false;
    }
}
