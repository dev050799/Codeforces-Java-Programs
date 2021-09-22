import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int a =n/2;
        if(n>2 && n%2 == 0 ){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
