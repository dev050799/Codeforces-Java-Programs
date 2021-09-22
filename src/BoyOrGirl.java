import java.util.Arrays;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s;
        s=in.next();
        char ch[] =s.toCharArray();
        Arrays.sort(ch);
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(ch[i]!=ch[i+1]){
                count++;
            }
        }
        if(count%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
