import java.util.Scanner;

public class VK {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(s);
            if (s.charAt(i) == 'V') sb.setCharAt(i, 'K');
            else sb.setCharAt(i, 'V');
            ans = Math.max(ans, cnt(sb.toString()));
        }
        System.out.println(Math.max(ans, cnt(s)));
    }

    private static int cnt(String s) {
        int i = 0;
        int ans = 0;
        while (i < s.length() - 1) {
            if (s.substring(i, i + 2).equals("VK")) {
                ans++;
                i += 2;
            } else {
                i++;
            }
        }
        return ans;
    }
}
