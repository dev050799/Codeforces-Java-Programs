import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[]= new int[5];
        for(int i=0;i<n;i++){
            int s = in.nextInt();
            a[s]++;
        }
        int total;
        total=a[4]+a[3]+a[2]/2;
        a[1]-=a[3];
        if(a[2]%2==1){
            total +=1;
            a[1]-=2;
        }
        if(a[1]>0){
            total += (a[1]+3)/4;
        }
        System.out.println(total);

    }
}
