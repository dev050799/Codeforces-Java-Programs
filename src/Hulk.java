import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0)
                sb.append("I hate");
            else
                sb.append("I love");
            if(n>1 && n!=i)
                sb.append(" that ");
        }
        sb.append(" it");
        System.out.println(sb);
    }
}
