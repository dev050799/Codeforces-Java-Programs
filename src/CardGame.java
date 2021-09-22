import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ch = s.charAt(0);
        String a = in.next();
        String b= in.next();
        if(a.charAt(0) > b.charAt(0)){
            if(b.charAt(1) != ch || (a.charAt(1)==ch && b.charAt(1)==ch)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        else {
            if(a.charAt(1) == ch && b.charAt(1)!=ch)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
