import java.util.Scanner;

public class GregorAndCryptography {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long p = in.nextLong();
            System.out.println((p-1)/2+" "+(p-1));
        }
    }
}
