import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][3];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < 3; j++)
                a[i][j] = in.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if((a[i][0]==1 && a[i][1]==1) || (a[i][1]==1 && a[i][2]==1) || (a[i][0]==1 && a[i][2]==1)){
                c++;
            }
        }
        System.out.println(c);
    }
}
