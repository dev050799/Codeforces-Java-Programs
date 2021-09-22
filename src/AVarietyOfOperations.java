import java.util.Scanner;

public class AVarietyOfOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            long c=in.nextLong();
            long d = in.nextLong();
            if(c==d){
                if(c==0&&d==0)
                    System.out.println(0);
                else System.out.println(1);
            }
            else{
                if((c+d)%2!=0)
                    System.out.println(-1);
                else System.out.println(2);
            }
        }
    }
}
