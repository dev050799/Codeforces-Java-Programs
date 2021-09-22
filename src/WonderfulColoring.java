import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WonderfulColoring {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t =in.nextInt();
        HashMap<Character,Integer> hashMap=new HashMap<>();
        while(t-->0){
            String s = in.next();
            int count =0,temp=0;
            for(int i=0;i<s.length();i++){
                if(hashMap.containsKey(s.charAt(i))){
                    hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
                }else hashMap.put(s.charAt(i),1);
            }
            for(Map.Entry entry : hashMap.entrySet()){
                if((int) entry.getValue() >= 2){
                    count++;
                } else if(Integer.valueOf((int)entry.getValue()) == 1){
                    temp++;
                }
            }
            count += (temp/2);
            System.out.println(count);
            hashMap.clear();
        }
    }
}
