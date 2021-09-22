import java.util.Locale;
import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a[] =  new String[n];
        for(int i =0;i<n;i++){
            a[i]= in.next();;
            a[i]=a[i].toLowerCase();
        }
        for(int i=0;i<n;i++){
            int p = a[i].length();
            if(p<=10)
                System.out.println(a[i]);
            else
                System.out.println(a[i].charAt(0)+""+(p-2)+""+a[i].charAt(p-1));
        }
    }
}
