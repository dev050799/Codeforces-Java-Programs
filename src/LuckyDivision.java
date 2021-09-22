import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b,a=n;
        boolean flag =false;
        int arr[]={4,7,47,74,44,444,447,474,477,777,774,744};
        for(int i=0;i<12;i++){
            if(n%arr[i]==0){
                flag=true;
            }
        }
        if(flag)
            System.out.println("YES");
        else System.out.println("NO");

    }
}
