import java.util.*;

public class Dragons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int x[] =new int[n];
        int y[]=new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(x[j]>x[j+1]){
                    int temp1,temp2;
                    temp1 =x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp1;
                    temp2 =y[j];
                    y[j]=y[j+1];
                    y[j+1]=temp2;
                }
            }
        }
        int c = 1;
        for (int i=0;i<n;i++) {
            if (s <= x[i]) {
                c = 0;
                break;
            } else {
                s = s + y[i];
            }
        }
        if (c == 0)
            System.out.println("NO");
        else
            System.out.println("YES");
    }

}
