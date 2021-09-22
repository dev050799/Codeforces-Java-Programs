import java.util.Scanner;

public class DonutShops {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long a,b,c;
            a=in.nextLong();
            b=in.nextLong();
            c=in.nextLong();
            long f=-1,s=-1;
            if(a<c)
                f=1;
            if(a*b>c)
                s=b;
            System.out.println(f+" "+s);
        }
    }
}
