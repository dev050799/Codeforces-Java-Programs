import java.util.Scanner;

public class JoeIsOnTv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
            sum +=(double) 1/i;
        System.out.println(sum);
    }
}
