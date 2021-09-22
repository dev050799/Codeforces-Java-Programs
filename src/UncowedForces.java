import java.util.Scanner;

public class UncowedForces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m[]=new int[5];
        int w[]=new int[5];
        for(int i=0;i<5;i++){
            m[i]= in.nextInt();
        }
        for(int i=0;i<5;i++){
            w[i]= in.nextInt();
        }
        int hs = in.nextInt();
        int hu = in.nextInt();
        int x[]={500,1000,1500,2000,2500};
        double ans=0;
        for(int i=0;i<5;i++){
            ans += Math.max(0.3*x[i],((1-(double)m[i]/250)*x[i])-50*w[i]);
        }
        ans += 100*hs - 50*hu;
        System.out.println((int) ans);
    }
}
