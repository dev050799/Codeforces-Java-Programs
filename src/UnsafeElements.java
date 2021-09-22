import java.util.Scanner;

public class UnsafeElements {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int m,n,c,digits=0,max=-2147483648,min=2147483647,z=0,y=0,s=0,t=0;
        c=in.nextInt();
        while(c>0){
            m=in.nextInt();
            n=in.nextInt();
            int a[][] =new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=in.nextInt();
                    if(max<a[i][j]) {
                        max = a[i][j];
                        z = i;
                        y = j;
                    }
                    if(min>a[i][j]) {
                        min = a[i][j];
                        s = i;
                        t = j;
                    }
                }
            }
            for(int i=0;i<m;i++) {
                for (int j = 0; j < n; j++) {
                    if (i == z || j == y || i == s || j == t)
                        continue;
                    else
                        digits++;
                }
            }
            System.out.println(digits);
        }

    }
}
