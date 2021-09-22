import java.util.Scanner;

public class ShortestPathWithObstacle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a[];
        int distance;
        int i;
        while (t-- > 0) {
            a = new int[6];
            for (i = 0; i < 6; i++)
                a[i] = in.nextInt();

            distance = Math.abs(a[0] - a[2]) + Math.abs(a[1] - a[3]);
            if (a[0] == a[2] && a[0] == a[4]) {
                if ((a[5] > a[1] && a[5] < a[3]) || (a[5] > a[3] && a[5] < a[1]))
                    distance += 2;
            } else if (a[1] == a[3] && a[1] == a[5]) {
                if ((a[4] > a[0] && a[4] < a[2]) || (a[4] > a[2] && a[4] < a[0]))
                    distance += 2;
            }
            System.out.println(distance);
        }
    }
}
