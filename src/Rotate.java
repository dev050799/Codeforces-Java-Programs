public class Rotate {
    static void rotate(int n, int a[][]){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp= a[i][j];
                a[i][j]= a[n-1-j][i];
                a[n-1-j][i]= temp;
            }
        }
        for(int i=0;i<n;i++){
            int t=0;
            int b = n-1;
            while(t<b){
                int temp = a[t][i];
                a[t][i]=a[n-1-b][i];
                a[n-1-b][i] = temp;
                t++;
                b--;
            }
        }
    }
    static void display(int n, int a[][]){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(" " + a[i][j]);
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        int n = 4;
        int a[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        rotate(n, a );
        display(n, a);
    }
}