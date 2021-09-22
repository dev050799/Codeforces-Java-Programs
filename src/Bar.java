import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
            a[i]= in.next();
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i].equals("ABSINTH") || a[i].equals("WINE") || a[i].equals("WHISKEY") || a[i].equals("SAKE") || a[i].equals("BEER")
            || a[i].equals("BRANDY") || a[i].equals("CHAMPAGNE") || a[i].equals("GIN") || a[i].equals("RUM") || a[i].equals("TEQUILA")
            || a[i].equals("VODKA") || a[i].equals("0") || a[i].equals("1") || a[i].equals("2") || a[i].equals("3")
                    || a[i].equals("4") || a[i].equals("5") || a[i].equals("6") || a[i].equals("7") || a[i].equals("8")
                    || a[i].equals("9") || a[i].equals("10") || a[i].equals("11") || a[i].equals("12") || a[i].equals("13")
                    || a[i].equals("14") || a[i].equals("15") || a[i].equals("16") || a[i].equals("17")){
                count++;
            }

        }
        System.out.println(count);
    }
}
