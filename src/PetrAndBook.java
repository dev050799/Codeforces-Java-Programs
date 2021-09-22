import java.util.Scanner;

public class PetrAndBook {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int a[] =new int[7];
        for(int i=0;i<7;i++)
            a[i]= in.nextInt();
        int sum =a[0],j=0;
        while (sum < n)
        {
            j++;
            j %= 7;
            sum += a[j];
        }
        System.out.println(j+1);
    }
}
