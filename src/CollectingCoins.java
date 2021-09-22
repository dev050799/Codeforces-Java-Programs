import java.util.Arrays;
import java.util.Scanner;

public class CollectingCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            long a[] =new long[3];
            for(int i=0;i<3;i++)
                a[i]= in.nextLong();
            long n= in.nextLong();
            Arrays.sort(a);
            long diff = a[2]-a[0];
            diff+=a[2]-a[1];
            if(n>=diff){
                n-=diff;
                if(n%3==0)
                    System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }

    }
}
