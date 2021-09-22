import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String s = "hello";
        int i,j=0;
        int flag =0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==s.charAt(j)){
                j++;
                flag++;
            }
            if(flag==5)
                break;
        }
        if(flag==5)
            System.out.println("YES");
        else
            System.out.println("NO");

    }

}

