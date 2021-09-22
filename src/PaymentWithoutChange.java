import java.util.Scanner;

public class PaymentWithoutChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        while(t-->0){
            long a = in.nextLong();
            long b =in.nextLong();
            long n= in.nextLong();
            long s = in.nextLong();
            long x=s/n;
            if(x>=a)
                x=a;
            if((x*n)+b >= s)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
