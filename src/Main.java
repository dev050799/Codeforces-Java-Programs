import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int[] arr= new int[501];
        int flag=0;
        for (int i = 0; i<l; i++) {
            int a=sc.nextInt();
            arr[a]=arr[a]+1;
        }
        for (int i = 0; i <501; i++) {
            if(arr[i]%2==0 && arr[i]!=0){
                System.out.println(i);
                flag =1;
            }

        }
        if(flag==1)
            System.exit(0);
        System.out.println(-1);
    }
}
