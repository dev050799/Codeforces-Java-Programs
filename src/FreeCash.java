import java.util.Scanner;

public class FreeCash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int h =in.nextInt();
        int m =in.nextInt();
        int c=1,cash=1;
        while (--n>0){
            int h0= in.nextInt();
            int m0= in.nextInt();
            if(h==h0 && m==m0){
                c++;
                if(c>cash)
                    cash=c;
            }
            else c=1;
            h=h0;
            m=m0;
        }
        System.out.println(cash);
    }
}
