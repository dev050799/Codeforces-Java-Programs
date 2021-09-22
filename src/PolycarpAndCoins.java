import java.util.Scanner;

public class PolycarpAndCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long n,x=0,y=0;
            n=in.nextLong();
            if(n==1){
                x=1;
                y=0;
            }
            else if(n==2){
                x=0;
                y=1;
            }
            else{
                if(n%3==0){
                    x=n/3;
                    y=x;
                }
                else {
                    if(n%3==1){
                        x=n/3;
                        y=x;
                        x=x+1;
                    }
                    else if(n%3==2){
                        x=n/3;
                        y=x+1;
                    }
                }
            }
            System.out.println(x+" "+y);

        }
    }
}
