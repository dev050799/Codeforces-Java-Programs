import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int c=0;
        long ans =sumOfDigits(n);
        if(n.length()>1)
            c=1;
        if (ans > 9) {
            while(ans>9){
                ans=sumOfDigits(ans);
                c++;
            }
        }
        System.out.println(c);
    }
    public static int sumOfDigits(long n){
        int a;
        int ans=0;
        while(n>0){
            a= (int) (n%10);
            ans=ans+a;
            n=n/10;
        }
        return ans;
    }
    public static long sumOfDigits(String n){
        int a;
        long ans=0;
        for(int i=0;i<n.length();i++){
            char c =n.charAt(i);
            a = Integer.parseInt(String.valueOf(c));
            ans +=a;
        }
        return ans;
    }
}
