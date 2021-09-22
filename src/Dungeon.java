import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            long a = in.nextLong();
            long b= in.nextLong();
            long c= in.nextLong();
            long sum=a+b+c;
            if(sum%9==0){
                long x=Math.min(a,b);
                x=Math.min(x,c);
                if(sum/9<=x){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
    }
}
