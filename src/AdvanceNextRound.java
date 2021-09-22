import java.util.Scanner;

public class AdvanceNextRound {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        a=a-1;
        int x[] = new int[n];
        int y=0;
        for (int i = 0; i<n; i++)
            x[i] = in.nextInt();
        for(int i = 0; i<n; i++){
            if(x[a]<=x[i] && x[i]>0)
                y++;
        }
        System.out.println(y);
    }
}
