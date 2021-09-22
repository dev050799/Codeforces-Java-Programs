import java.util.Scanner;

public class SupercentralPoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a[][] =new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                a[i][j]= in.nextInt();
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int u=0,d=0,l=0,r=0;
            for(int j=0;j<n;j++){
                if(a[i][0]<a[j][0] && a[i][1]==a[j][1])
                    r++;
                if(a[i][0]>a[j][0] && a[i][1]==a[j][1])
                    l++;
                if(a[i][0]==a[j][0] && a[i][1]>a[j][1])
                    d++;
                if(a[i][0]==a[j][0] && a[i][1]<a[j][1])
                    u++;
            }
            if(u>0 && l>0 && d>0 && r>0)
                ans++;
        }
        System.out.println(ans);
    }
}

