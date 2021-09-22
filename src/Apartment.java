import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a, b, c;
        while (n > 0) {
            a = in.nextInt();
            b = in.nextInt();
            if (a <= 2) {
                c = 1;
            } else {
                a = a - 2;
                if (a % b != 0)
                    c = (a / b) + 2;
                else
                    c = a / b + 1;
            }
            System.out.println(c);
            n--;
        }
    }
}
