import java.util.Scanner;

public class MaxCost {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t =in.nextInt();
        int i,n,a,b,total,sum;
        String s;
        while(t-->0){
            n = in.nextInt();
            a= in.nextInt();
            b= in.nextInt();
            s= in.next();
            sum=a*n;
            if(b>0) sum += b*n;
            else{
                total=0;
                for(i=0;i<n-1;i++){
                    if(s.charAt(i) != s.charAt(i+1)) total++;
                }
                total++;
                sum += ((total/2)+1)*b;
            }
            System.out.println(sum);
        }
    }
}
