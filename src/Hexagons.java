import java.util.Scanner;

public class Hexagons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println((n*(n+1)/2)*6 + 1);
    }
}
