import java.util.Scanner;

public class DigitalCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, v[] = {2, 7, 2, 3, 3, 4, 2, 5, 1, 2};
        n=in.nextInt();
        System.out.println(v[n/10] * v[n%10]);
    }
}
