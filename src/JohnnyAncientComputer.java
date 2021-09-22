import java.util.Scanner;

public class JohnnyAncientComputer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ;
        long a, b;
        while (t-- > 0) {
            int c = 0;
            a = in.nextLong();
            b = in.nextLong();
            if (a == b) {
                System.out.println(0);
                continue;
            }
            if (a > b) {
                while (a > b) {
                    if (a % 8 == 0 && a / 8 >= b) {
                        a /= 8;
                        c++;
                    } else if (a % 4 == 0 && a / 4 >= b) {
                        a /= 4;
                        c++;
                    } else if (a % 2 == 0 && a / 2 >= b) {
                        a /= 2;
                        c++;
                    } else {
                        break;
                    }
                }
            } else {
                while (a < b) {
                    if (a * 8 <= b) {
                        a *= 8;
                        c++;
                    } else if (a * 4 <= b) {
                        a *= 4;
                        c++;
                    } else if (a * 2 <= b) {
                        a *= 2;
                        c++;
                    } else {
                        break;
                    }
                }
            }
            if (a == b) {
                System.out.println(c);
            } else {
                System.out.println(-1);
            }
        }
    }
}
