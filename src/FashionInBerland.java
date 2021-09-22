import java.util.Scanner;

public class FashionInBerland {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]= in.nextInt();
            if(a[i]==0){
                c++;
            }
        }

        if((c!=1 && n!=1) || (n==1 && c==1)){
            System.out.println("NO");
        }
        else System.out.println("YES");
    }
}
