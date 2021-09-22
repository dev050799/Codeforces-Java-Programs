import java.util.Scanner;

public class DominoDisaster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            String s = in.next();
            String a="";
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='U')
                    a=a+'D';
                else if(s.charAt(i)=='D')
                    a=a+'U';
                else a=a+s.charAt(i);
            }
            System.out.println(a);
        }

    }
}
