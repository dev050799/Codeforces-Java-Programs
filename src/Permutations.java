import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i, n;
        while (t-- > 0) {
            n = in.nextInt();
            if (n % 2 != 0) {
                System.out.print(3+" "+1+" "+2+" ");
                for (i = 4; i <= n; i+=2) {
                    System.out.print((i + 1) + " " + i+" ");
                }
            } else
                for (i = 1; i <= n; i+=2) {
                    System.out.print((i + 1) + " " + i+" ");
                }
            System.out.println();
        }

    }
}
