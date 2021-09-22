import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        int i,n,a,c,d;
        while(t-- > 0){
            n=in.nextInt();
            c=0;
            d=0;
            for(i=1;i<=n*2;i ++){
                a= in.nextInt();
                if(a%2==0)
                    c++;
                else
                    d++;
            }
            if(d==n)
                System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
