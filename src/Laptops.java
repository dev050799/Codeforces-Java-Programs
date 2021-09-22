import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        for(int i=0;i<n;i++){
            int a= in.nextInt();
            int b= in.nextInt();
            if(a!=b){
                System.out.println("Happy Alex");
                System.exit(0);
            }

        }
        System.out.println("Poor Alex");
    }
}
