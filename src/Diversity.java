import java.util.*;

public class Diversity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        String a = "";
        int c = 0;
        Set<Character> characterSet = new HashSet<>();
        for(int i=0;i<s.length();i++){
            characterSet.add(s.charAt(i));
        }
        if(n>s.length())
            System.out.println("impossible");
        else if(n<=characterSet.size())
            System.out.println(0);
        else System.out.println(n- characterSet.size());

    }
}
