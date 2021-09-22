import java.util.Scanner;

public class MoveBrackets {
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n= in.nextInt();
            String s= in.next();
            int flag,count =0;
            for(int i=0;i<s.length();i++){
                flag=0;
                if(s.charAt(i)=='('){
                    for(int j=i+1;j<s.length();j++){
                        if(s.charAt(j)==')') {
                            flag=1;
                            s=charRemoveAt(s,j);
                            break;
                        }
                    }
                    if(flag==0)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
