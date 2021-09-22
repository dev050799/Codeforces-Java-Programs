import java.util.Scanner;

public class StringTAsk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s = s.toLowerCase();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'y')
                continue;
            else str = str + "." + s.charAt(i);
        }
        System.out.println(str);
    }
}
