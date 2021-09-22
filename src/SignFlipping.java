import java.util.Scanner;

public class SignFlipping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        while(t-->0){
            int n= in.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++)
                a[i]= in.nextInt();
            for(int i=0;i<n;i++){
                if(i%2==1)
                    a[i]=-1*Math.abs(a[i]);
                else a[i]=Math.abs(a[i]);
                System.out.print(a[i]+" ");
            }
        }
    }
}
