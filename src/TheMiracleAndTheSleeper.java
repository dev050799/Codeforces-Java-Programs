import java.util.Scanner;

public class TheMiracleAndTheSleeper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        while(t-- > 0){
            long l = in.nextLong();
            long r = in.nextLong();
            long a = r/2+1;
            if(a>=l)
                System.out.println(r%a);
            else System.out.println(r%l);

        }
    }
}
