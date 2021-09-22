import java.util.Scanner;

public class MinimumInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long l= in.nextLong();
            long r =in.nextLong();
            long d = in.nextLong();
            if(l>d)
                System.out.println(d);
            else {
                int x = (int) (r%d);
                int ans = (int) (r-x+d);
                System.out.println(ans);
            }
        }
    }
}
