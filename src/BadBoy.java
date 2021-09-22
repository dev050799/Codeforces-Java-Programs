import java.util.Scanner;

public class BadBoy {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t =in.nextInt();
        int n,m,x,y;
        while(t-->0){
            n= in.nextInt();
            m= in.nextInt();
            x= in.nextInt();
            y= in.nextInt();
            if((x==1 && y==1)|| (x==n && y==m)){
                System.out.println(1+" "+m);
                System.out.println((n+" "+1));
            }else{
                System.out.println(1+" "+1);
                System.out.println(n+" "+m);
            }
        }
    }
}
