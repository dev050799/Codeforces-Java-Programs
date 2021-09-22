import java.util.Scanner;

public class CandyBags {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 0; i < n; ++i)
        {
            System.out.print( i + 1);
            for (int j = 1; j < n; ++j)
            {
                System.out.print(" "+ (n * j + (i + j) % n + 1));
            }
            System.out.println();
        }
    }
}
