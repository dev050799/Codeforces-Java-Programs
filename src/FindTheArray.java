import java.util.Scanner;

public class FindTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        while(t-->0){
            int num=1;
            int ans =0;
            int s = in.nextInt();
            while (s>0){
                ans++;
                s-=num;
                num+=2;
            }
            System.out.println(ans);
        }
    }
}
