import java.util.Arrays;
import java.util.Scanner;

public class SubsequecePermutation {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t= in.nextInt();
        int i,n,a;
        String s;
        char s1[];
        while(t-->0){
            n=in.nextInt();
            s= in.next();
            a=0;
            s1 = s.toCharArray();
            Arrays.sort(s1);
            for(i=0;i<n;i++)
                if(s.charAt(i) != s1[i])
                    a++;
            System.out.println(a);

        }
    }
}
