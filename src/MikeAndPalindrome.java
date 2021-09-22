import java.util.Scanner;

public class MikeAndPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int c = 0;
        int n = s.length();
        if (n % 2 == 0) {
            int j = n - 1;
            int k = 0;
            for (int i = 0; i < n / 2; i++) {
                if (s.charAt(i) != s.charAt(j))
                    k++;

                j--;
            }

            if (k == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        } else {
            int j = n - 1;
            int k = 0;
            for (int i = 0; i < n / 2; i++, j--) {
                if (s.charAt(i) != s.charAt(j))
                    k++;
            }

            if (k <= 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
