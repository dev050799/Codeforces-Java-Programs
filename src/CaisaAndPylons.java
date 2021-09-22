import java.util.Scanner;

public class CaisaAndPylons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n+1];
        a[0]=0;
        int e=0,d=0;
        for (int i=1;i<=n;i++){
            a[i]= in.nextInt();
            e += a[i-1]-a[i];
            if(e<0){
                d -=e;
                e=0;
            }
        }
        System.out.println(d);
    }
}
