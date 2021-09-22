import java.util.Scanner;

public class ArithmeticArrays {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t =in.nextInt();
        int a[];
        int i,sum,n;
        while(t-->0){
            n= in.nextInt();;
            a =new int[n];
            sum=0;
            for(i=0;i<n;i++){
                a[i]= in.nextInt();
                sum += a[i];
            }
            if(sum==n)
                System.out.println(0);
            else if(sum<n)
                System.out.println(1);
            else
                System.out.println(sum-n);
        }
    }
}
