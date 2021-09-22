import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String[] b = a.split("0");
        String[] c = a.split("1");
        int n = 0, m = 0;
        for (String x : b) {
            if (x.length() >= 7)
                n++;
        }
        for (String x : c) {
            if (x.length() >= 7)
                m++;
        }
        if (m > 0 || n > 0)
            System.out.println("YES");
        else System.out.println("NO");

    }
}
