import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long i,k,count=0;
        k= in.nextInt();
        for(i=19;i<11000000;i+=9){
            if(sumOfDigits(i)==10){
                count++;
                if(count==k){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static int sumOfDigits(long n){
        int sum = 0;
        while (n>0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
