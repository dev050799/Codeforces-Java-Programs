import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MiddleClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int x = s.nextInt();
            ArrayList<Integer> v = new ArrayList<>();
            for(int i = 0; i < n; i++) v.add(s.nextInt());
            Collections.sort(v);
            long sum = 0, res = 0, br = 1;
            for(int i = n - 1; i >= 0; i--) {
                if((sum + v.get(i)) / br >= x) {
                    sum += v.get(i);
                    br++;
                    res++;
                }
                else break;
            }
            System.out.println(res);
        }
    }
}