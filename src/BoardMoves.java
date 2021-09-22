import java.util.Scanner;

public class BoardMoves {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long n,m=0,s=0;
            n=in.nextLong();
            if(n==1)
                s=0;
            while (n>=3){
                m=(n*n)-(n-2)*(n-2);
                s=s+m*(n/2);
                n=n-2;
            }
            System.out.println(s);
        }
    }
}
