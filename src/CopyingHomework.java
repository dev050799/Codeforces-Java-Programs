import java.util.Scanner;

public class CopyingHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            System.out.println(n-a+1);
        }
    }
}
