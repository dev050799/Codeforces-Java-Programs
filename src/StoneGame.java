import java.util.Scanner;

public class StoneGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a[];
        int n, i, min, max, posMax, posMin,mid,c,d;

        while (t-- > 0) {
            n = in.nextInt();
            a = new int[n];
            posMax = 0;
            posMin = 0;
            c=0;d=0;
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            for (i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if (a[i] > max) {
                    posMax = i+1;
                    max =a[i];
                }
                if (a[i] < min) {
                    posMin = i+1;
                    min =a[i];
                }
            }
            if(posMax>posMin){
                c=Math.min(n-(posMax-posMin-1),n-posMin+1);
                d=Math.min(c,posMax);

            }
            else{
                c=Math.min(n-(posMin-posMax-1),n-posMax+1);
                d=Math.min(c,posMin);

            }
            System.out.println(d);


        }
    }
}
