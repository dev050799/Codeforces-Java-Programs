import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] =new int[n];
        int mySum=0,broSum=0,count=0;
        for(int i=0;i<n;i++){
            a[i]= in.nextInt();
            broSum+=a[i];
        }
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--){
            mySum+=a[i];
            broSum-=a[i];
            count++;
            if(mySum>broSum)
                break;
        }
        System.out.println(count);
    }
}
