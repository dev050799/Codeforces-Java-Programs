import java.util.Locale;
import java.util.Scanner;

public class cAPSlOCK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String s1=s.toUpperCase();
        String s2 =s.substring(1).toUpperCase();
        char ch;
        if(s.equals(s1)){
            s=s.toLowerCase();
        }
        else if(s.charAt(0)>=97 && s.charAt(0)<=122 && s.substring(1).equals(s2)){
            ch=Character.toUpperCase(s.charAt(0));
            s=ch+s.substring(1).toLowerCase();
        }
        System.out.println(s);
    }
}
