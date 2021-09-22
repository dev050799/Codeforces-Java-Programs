import java.util.Scanner;

public class LittleElephantsAndBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int c =s.indexOf("0");
        if(c==-1)
            System.out.println(s.substring(1));
        else
        System.out.println(s.substring(0,c)+s.substring(c+1));
    }
}
