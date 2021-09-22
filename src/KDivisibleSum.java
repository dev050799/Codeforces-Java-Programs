import java.util.Scanner;

public class KDivisibleSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long n= in.nextLong();
            long k= in.nextLong();
            if(n>=k){
                if(n%k==0)
                    System.out.println(1);
                else System.out.println(2);
            }else System.out.println((k+n-1)/n);
        }
    }
}
