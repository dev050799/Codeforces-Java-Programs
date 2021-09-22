import java.util.Scanner;

public class Bet {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t= in.nextInt();
        long a,b,c,d;

        while(t-->0){
            a=in.nextLong();
            b=in.nextLong();
            c=Math.abs(a-b);
            System.out.println(c);
            if(c==0)
                d=0;
            else d=a%c;
            System.out.println(Math.min(d,c-d));
        }
    }
}
