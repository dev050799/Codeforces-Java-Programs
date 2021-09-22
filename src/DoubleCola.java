import java.util.Scanner;

public class DoubleCola {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a=1;
        while(a*5<n){
            n-=a*5;
            a*=2;
        }
        String s[]={"Sheldon","Leonard","Penny","Rajesh","Howard"};
        int r= (int) ((n-1)/a);
        System.out.println(s[r]);
    }
}
