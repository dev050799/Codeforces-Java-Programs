import java.util.Scanner;

public class Minesweeper {
     static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t= 1;
        while(t-->0)
            solve();
    }
    public static void solve(){
        int n =in.nextInt();
        int m =in.nextInt();
        char ch[][]= new char[n][m];
        for(int i=0;i<n;i++){
            String s = in.next();
            for(int j=0;j<m;j++){
                ch[i][j]=s.charAt(j);
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if(ch[i][j] >= '1' && ch[i][j] <='9'){
                    int val = ch[i][j] - '0';
                    int count = 0;
                    if (i + 1 < n && j < m && ch[i+1][j] == '*') {
                        count++;
                    }
                    if (i < n && j + 1 < m && ch[i][j+1] == '*'){
                        count++;
                    }
                    if (i + 1 < n && j + 1 < m && ch[i+1][j+1] == '*'){
                        count++;
                    }
                    if (i + 1 < n && j - 1 >= 0 && ch[i+1][j-1] == '*'){
                        count++;
                    }
                    if (i < n && j - 1 >= 0 && ch[i][j-1] == '*'){
                        count++;
                    }
                    if (i - 1 >= 0 && j < m && ch[i-1][j] == '*'){
                        count++;
                    }
                    if (i - 1 >= 0 && j - 1 >= 0 && ch[i-1][j-1] == '*'){
                        count++;
                    }
                    if (i - 1 >= 0 && j + 1 < m && ch[i-1][j+1] == '*'){
                        count++;
                    }
                    if (count != val){
                        System.out.println("NO");
                        return;
                    }
                }
                else if (ch[i][j] == '.'){
                    boolean flag = true;
                    if (i + 1 < n && j < m && ch[i+1][j] == '*') {
                        flag = false;
                    }
                    if (i < n && j + 1 < m && ch[i][j+1] == '*'){
                        flag = false;
                    }
                    if (i + 1 < n && j + 1 < m && ch[i+1][j+1] == '*'){
                        flag = false;
                    }
                    if (i + 1 < n && j - 1 >= 0 && ch[i+1][j-1] == '*'){
                        flag = false;
                    }
                    if (i < n && j - 1 >= 0 && ch[i][j-1] == '*'){
                        flag = false;
                    }
                    if (i - 1 >= 0 && j < m && ch[i-1][j] == '*'){
                        flag = false;
                    }
                    if (i - 1 >= 0 && j - 1 >= 0 && ch[i-1][j-1] == '*'){
                        flag = false;
                    }
                    if (i - 1 >= 0 && j + 1 < m && ch[i-1][j+1] == '*'){
                        flag = false;
                    }
                    if (!flag){
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        System.out.println("YES");
    }
}