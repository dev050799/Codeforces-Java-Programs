import java.util.Scanner;

public class EffectiveApproach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[100001];
        int x;
        for(int i=1;i<=n;i++){
            x= in.nextInt();
            a[x]=i;
        }
        long v=0,p=0;
        int s;
        int m = in.nextInt();
        while (m-->0){
            s = in.nextInt();
            v=v+a[s];
            p=p+(n+1-a[s]);
        }
        System.out.println(v+" "+p);
    }
}
