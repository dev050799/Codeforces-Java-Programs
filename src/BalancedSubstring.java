import java.util.Scanner;

public class BalancedSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while ((t-- > 0)) {
            int n = in.nextInt();
            String s = in.next();
            int a = 0, b = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a')
                    a++;
                else b++;
            }
            if (a == 0 || b == 0) System.out.println(-1 + " " + -1);
            else {
                for (int i = 0; i < n - 1; i++) {
                    if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b') {
                        System.out.println((i + 1) + " " + (i + 2));
                        break;
                    } else if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a') {
                        System.out.println((i + 1) + " " + (i + 2));
                        break;
                    }
                }
            }
        }
    }
}
