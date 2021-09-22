import java.util.Scanner;

public class CarryingCorindum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int t=in.nextInt();
         while(t-->0){
             String s=in.next();
             long max=-1000000000;
             long min= 1000000000;
             int x=0,y=0;
             int n=s.length();
             for(int i=0;i<n;i++){
                 if(i%2==1){
                     x=x*10+(s.charAt(i)-'0');
                 }
                 else y=y*10+(s.charAt(i)-'0');
             }
             System.out.println((x+1)*(y+1)-2);
         }
    }
}
