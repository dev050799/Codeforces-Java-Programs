import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][3];
        for(int i = 0;i<n;i++){
            for (int j=0;j<3;j++)
                a[i][j]= in.nextInt();
        }
        int x=0,y=0,z=0;
        int i=0;
        while (i<n){
            x=x+a[i][0];
            y=y+a[i][1];
            z=z+a[i][2];
            i++;
        }
        if(x==0 && y==0 && z==0)
            System.out.println("YES");
        else System.out.println("NO");

    }
}
