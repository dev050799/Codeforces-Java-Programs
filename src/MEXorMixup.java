import java.util.Scanner;

public class MEXorMixup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int n= (int) (3e5+5);
        int x[]= new int[n];
        for(i=1;i<n;i++){
            x[i]=x[i-1]^(i-1);
        }
        int t =in.nextInt();
        while(t-->0){
            int a = in.nextInt();
            int b =in.nextInt();
            int y =x[a];
            if(y==b)
                System.out.println(a);
            else if((y^b)==a)
                System.out.println(a+2);
            else System.out.println(a+1);
        }

    }
}
