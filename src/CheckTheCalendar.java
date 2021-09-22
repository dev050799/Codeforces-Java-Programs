import java.util.Scanner;

public class CheckTheCalendar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String s1 = in.next();
        String a[] ={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        int x=0,y=0;
        for(int i=0;i<7;i++){
            if(s.equals(a[i])){
                x=i;
            }
            if(s1.equals(a[i]))
                y=i;
        }
        if((x+28)%7==y || (x+30)%7==y || (x+31)%7==y){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
