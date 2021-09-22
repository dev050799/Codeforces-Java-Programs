import java.util.Scanner;

public class JeffAndDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, t, f = 0, z = 0;
        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            t = in.nextInt();
            if (t == 0)
                z++;
            else if (t == 5)
                f++;
        }
        if (z == 0)
            System.out.println(-1);
        else if (f < 9)
            System.out.println(0);
        else {
            f -= f % 9;
            for (int i = 0; i < f; i++)
                System.out.print(5);
            for (int i = 0; i < z; i++)
                System.out.print(0);
        }
    }
}
