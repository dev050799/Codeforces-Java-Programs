import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int count = 0;
        while (n / 2 != 0) {
            if (n % 2 == 1)
                count++;
            n = n / 2;
        }
        System.out.println(count+1);

    }
}
