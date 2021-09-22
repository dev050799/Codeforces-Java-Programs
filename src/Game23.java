import java.util.Scanner;

public class Game23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        int c = 0;
        long a = m / n;
        if (m == n)
            System.out.println(0);
        else if (m % n == 0) {
            while (a > 1) {
                if (a % 3 == 0) {
                    a = a / 3;
                    c++;
                }
                if (a % 2 == 0) {
                    a = a / 2;
                    c++;
                }
                if(a%2!=0 && a%3!=0 && a!=1){
                    c=-1;
                    break;
                }
            }
            System.out.println(c);
        } else System.out.println(-1);

    }
}
