import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n= in.nextLong();
        long m= in.nextLong();
        long a =in.nextLong();
        int len=0,bre=0;
        long c=n/a;
        if(n%a!=0)
            c++;
        long d =m/a;
        if(m%a!=0)
            d++;
        System.out.println(c*d);

    }
}
