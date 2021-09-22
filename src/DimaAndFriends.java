import java.util.Scanner;

public class DimaAndFriends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int total=0,answer=0;
        for (int i = 0; i < n; ++i)
        {
            int f = in.nextInt();
            total += f;
        }
        for (int i = 1; i <= 5; ++i)
        {
            if ((total + i) % (n + 1) != 1)
            {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
