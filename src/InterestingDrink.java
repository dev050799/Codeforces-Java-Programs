import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        Arrays.sort(a);
        int d = in.nextInt();
        for (int i = 0; i < d; i++) {
            int s = in.nextInt();
            System.out.println(upperBound(a,s));
        }
    }
    static int upperBound(long a[], int x) {
        int l=-1,r=a.length;
        while(l+1<r) {
            int m=(l+r)>>>1;
            if(a[m]<=x) l=m;
            else r=m;
        }
        return l+1;
    }


}
