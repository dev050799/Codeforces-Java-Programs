import java.util.Scanner;

public class LifeWithoutZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c= a+b;
        long x = removeZero(a);
        long y = removeZero(b);
        long z = removeZero(c);
        if((x+y)==z){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
    public static long removeZero(long n){
        String s= String.valueOf(n);
        String t="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                t =t+s.charAt(i);
            }
        }
        long l = Long.parseLong(t);
        return l;
    }
}
