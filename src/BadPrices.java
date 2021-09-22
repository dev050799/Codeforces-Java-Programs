import java.util.Scanner;

public class BadPrices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++)
                a[i]= in.nextInt();
            int min = a[n-1];
            int count=0;
            for(int i=n-2;i>=0;i--){
                if(a[i]>min){
                    count++;
                }
                min=Math.min(a[i],min);
            }
            System.out.println(count);
        }
    }
}
