import java.util.Scanner;

public class FriendsAndCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();;
        int a[];
        int n,i,sum,k,c;
        while (t-- > 0){
            n= in.nextInt();
            a=new int[n];
            sum=0;
            k=0;
            c=0;
            for(i=0;i<n;i++) {
                a[i] = in.nextInt();
                sum += a[i];
            }
            c=sum/n;
            if(sum%n==0){
                for(i=0;i<n;i++){
                    if(a[i]>c)
                        k++;
                }
                System.out.println(k);
            }
            else System.out.println(-1);

        }

    }
}
