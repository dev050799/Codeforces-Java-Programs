import java.util.Scanner;

public class LoveSong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, q, l, r, i, sum,a[];
        char ch;
        String s;
        n = in.nextInt();
        q = in.nextInt();
        s = in.next();
        a=new int[n+1];
        a[0]=0;
        for(i=1;i<n+1;i++){
            a[i]=a[i-1]+s.charAt(i-1)-96;
        }
        while (q-- > 0) {
            l = in.nextInt();
            r = in.nextInt();
            l = l - 1;

            System.out.println(a[r]-a[l]);
        }
    }
}
