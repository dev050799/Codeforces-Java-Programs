import java.util.Scanner;

public class TAkeUrPlaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t =in.nextLong();
        while (t-- > 0) {
            int n =in.nextInt();
            long a[]=new long[n];
            int e=0,o;
            for (int i=0;i<n;i++){
                a[i]=in.nextLong();
                if(a[i]%2==0)
                    e++;
            }
            o=n-e;
            int b=0;
            if(Math.abs(o-e)==1 || o-e==0){
                for(int i=0;i<n-1;i++){
                    if((a[i]%2==0 && a[i+1]%2==0) || (a[i]%2!=0 && a[i+1]%2!=0) )
                        b++;
                }
            } else b=-1;
            int c =n/2;
            if(b>=c)
                System.out.println(c);
            else System.out.println(b);
        }
    }
}
