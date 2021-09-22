import java.util.Scanner;

public class JzzhuAndChildren {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m=in.nextInt();
        int max=0;
        int child=1;
        int i=1;
        while(n-->0){
            int j=1;
            int a = in.nextInt();
            int b=a;
            while(b>m){
                b = b-m;
                j++;
            }
            if(max<=j){
                max=j;
                child=i;
            }
            i++;
        }
        System.out.println(child);
    }
}
