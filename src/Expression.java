import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b= in.nextInt();
        int c = in.nextInt();
        int sum;
        if((a==1 && b==1 && c==1) || (a==1 && c==1))
            sum = a+b+c;
        else if(a==1)
            sum=(a+b)*c;
        else if(b==1)
            sum=(b+Math.min(a,c))*Math.max(a,c);
        else if(c==1)
            sum=a*(b+c);
        else sum=a*b*c;
        System.out.println(sum);

    }
}
