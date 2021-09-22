import java.util.Scanner;

public class Joysticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
        int count =0;
        while (a>0 && b>0){
            if(a==1 && b==1)
                break;
            count++;
            if(a>b){
                int temp=a;
                a=b;
                b=temp;
            }
            a++;
            b -=2;
        }
        System.out.println(count);
    }
}
