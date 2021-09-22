import java.util.Scanner;

public class Bikers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        int e[]= new int[t];
        for(int i=0;i<t;i++)
            e[i]= in.nextInt();
        int count =0;
        for(int i=0;i<t;i++){
            for(int j= i+1;j<t;j++){
                if(e[i]!=e[j] && e[i]==0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
