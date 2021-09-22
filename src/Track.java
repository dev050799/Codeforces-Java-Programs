import java.util.Scanner;

public class Track {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int  t = in.nextInt();
        int n,i;
        long s;
        long p;
        while(t-- >0){
            n= in.nextInt();
            s=0;
            for(i=0;i<n;i++){
                int a = in.nextInt();
                s += a;
            }
            p=s%n;
            System.out.println(Math.abs(p*(n-p)));
        }

    }
}
