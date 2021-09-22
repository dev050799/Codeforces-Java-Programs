import java.util.Arrays;
import java.util.Scanner;

public class BinaryRemovals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s;
            s = in.next();
            int flag = 0;
            int c = 0, d = 0;
            int p = 0;
            char s1[] = s.toCharArray();
            Arrays.sort(s1);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == s1[i]) {
                    p = 1;
                } else {
                    p = 0;
                    break;
                }
            }
            if (p == 1)
                System.out.println("YES");

            else {
                int y = 0;
                for (int i = s.length() - 1; i > 0; i--) {
                    if (s.charAt(i) == '0' && s.charAt(i - 1) == '0') {
                        y = i - 1;
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println("YES");
                    continue;
                }
                int flag2 = 0;
                for (int i = y; i > 0; i--) {
                    if (s.charAt(i) == '1' && s.charAt(i - 1) == '1') {
                        flag2 = 1;
                        break;
                    }
                }
                if (flag2 == 0) {
                    System.out.println("YES");
                } else
                    System.out.println("NO");
            }
        }
    }
}
