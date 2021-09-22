import java.util.Scanner;

public class Cherry {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t =in.nextInt();
        long d;
        int n,i;
        long c;
        long a[];
        while(t-->0){
            n= in.nextInt();
            a = new long[n];
            for(i=0;i<n;i++)
                a[i]=in.nextInt();
            c=0;
            for(i=0;i<n-1;i++){
                d=a[i]*a[i+1];
                c=Math.max(c,d);
            }
            System.out.println(c);
        }
    }
}
