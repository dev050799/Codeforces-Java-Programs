import java.util.Scanner;

public class WaterLily {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double h= in.nextDouble();
        double l= in.nextDouble();
        double ans =(l*l-h*h)/(2*h);
        System.out.println(ans);
    }
}
