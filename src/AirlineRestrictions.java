import java.util.Scanner;

public class AirlineRestrictions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();
            int min= Math.min(a,b);
            min = Math.min(min,c);
            int max1,max2;
            max1=Math.max(a,b);
            max1=Math.max(max1,c);
            if((a<c && a>b) || (a>c && a<b))
                max2=a;
            else if((b<c && b>a) || (b>c && b<a))
                max2=b;
            else max2=c;
            if(min<=e && (max1+max2)<=d){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
