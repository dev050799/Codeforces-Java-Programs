import java.util.Scanner;

public class Football1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        String s[] = new String[n];
        for(int i=0;i<n;i++)
            s[i]=in.next();
        String s1=s[0];
        String s2="";
        int t=0,r=0;
        for(int i=0;i<n;i++){
            if(s1.equals(s[i]))
                t++;
            else {
                s2 =s[i];
                r++;
            }
        }
        if(t>r)
            System.out.println(s1);
        else System.out.println(s2);
    }

}
