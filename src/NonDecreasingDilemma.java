import java.util.Scanner;

public class NonDecreasingDilemma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int q=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]= in.nextInt();
        for(int i=0;i<q;i++){
            int t,x,y;
            t= in.nextInt();
            x= in.nextInt();
            y= in.nextInt();
            if(t==1){
                a[x-1]=y;
            }
            if(t==2){
                int l=x-1,r=y-1;
                int ans=0,flag=l;
                for(int j=l;j<r;j++){
                    if(a[j]>a[j+1]){
                        ans += find(j-flag+1);
                        ans += j-flag+1;
                        flag = j+1;
                    }
                }
                System.out.println(ans);
            }
        }

    }
    public static int find(int n){
        if(n<2)
            return 0;
        if(n==2)
            return 1;
        int c=(n*(n-1))/2;
        return c;

    }
}
//calculate how many non-decreasing subarrays exist within the subarray [al,al+1,…,ar].
// More formally, count the number of pairs of integers (p,q) such that l≤p≤q≤r and ap≤ap+1≤⋯≤aq−1≤aq.