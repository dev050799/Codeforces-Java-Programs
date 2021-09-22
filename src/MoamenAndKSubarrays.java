import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MoamenAndKSubarrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        while(t-->0){
            int n = in.nextInt();
            int k= in.nextInt();
            int i;
            int a[]=new int[n];
            int b[]=new int[n];
            for(i=0;i<n;i++){
                a[i]= in.nextInt();
                b[i]= a[i];
            }
            Arrays.sort(b);
            for(i=0;i<n;i++){
                map.put(b[i], i);
            }
            int c=0;
            for(i=0;i<n;i++){
                if(map.get(a[i]) >0 && i>0 && b[map.get(a[i])-1]==a[i-1]){
                }else c++;
            }
            if(c<=k)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
