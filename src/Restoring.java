import java.util.Scanner;

public class Restoring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long k = 0;
        int i;
        long arr[] = new long[4];
        for (i = 0; i < 4; i++) {
            arr[i] = in.nextLong();
            if (arr[i] > k) {
                k = arr[i];

            }
        }
        for (i = 0; i < 4; i++) {
            if (k > arr[i]) {
                System.out.println(k - arr[i]);
            }
        }
    }
}

