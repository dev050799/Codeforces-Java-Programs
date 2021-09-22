import java.util.Scanner;

public class From0toY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        long x,y,p=0,s,a,count;
        while (t-->0){
            x= in.nextLong();
            y= in.nextLong();
            s=y;
            count=0;
            a= (long) (x*Math.pow(10,p));
            while(s>0){
                p=0;
                while (x*Math.pow(10,p)<=s){
                    a= (long) (x*Math.pow(10,p));
                    p++;

                }
                s=s-a;
                if(s<x && s>0)
                    count = count+s;
                else
                    count++;
            }
            System.out.println(count);

        }

    }
}
