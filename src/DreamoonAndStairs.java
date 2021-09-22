import java.util.Scanner;

public class DreamoonAndStairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m,x;
        n= in.nextInt();
        m=in.nextInt();
        if(m>n)
            x=-1;
        else {
            if(n%2==0){
                x=n/2;
            }
            else x=n/2+1;
            while (x%m!=0)
                x++;
        }
        System.out.println(x);
    }
}
