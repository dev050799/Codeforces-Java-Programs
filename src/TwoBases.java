import java.util.Scanner;

public class TwoBases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long  a,b,c=0,d,e=0;

        a=in.nextLong();
        b= in.nextLong();
        while(a-->0){
            d= in.nextLong();
            c*=b;
            c+=d;
        }

        a=in.nextLong();
        b= in.nextLong();
        while(a-->0){
            d= in.nextLong();
            e*=b;
            e+=d;
        }

        if(c>e)
            System.out.println(">");
        else if(c<e)
            System.out.println("<");
        else
            System.out.println("=");
    }

}
