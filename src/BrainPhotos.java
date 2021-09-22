import java.util.Scanner;

public class BrainPhotos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        char ch[][]= new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ch[i][j] =in.next().charAt(0);
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ch[i][j]=='M' || ch[i][j]=='Y' || ch[i][j]=='C'){
                    c=1;
                }
            }
        }
        if(c==1)
            System.out.println("#Color");
        else System.out.println("#Black&White");
    }
}
