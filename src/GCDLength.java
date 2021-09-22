import java.util.Scanner;

public class GCDLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int a= in.nextInt();
            int b= in.nextInt();
            int c= in.nextInt();
            long x =(long)Math.pow(10,c-1);
            long y =(long)Math.pow(10,c-1);

            while(x<Math.pow(10,a-1))
                x*=2;
            while(y<Math.pow(10,b-1))
                y*=3;

            System.out.println(x+" "+y);
        }
    }
}
