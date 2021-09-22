import java.io.*;
import java.util.StringTokenizer;

public class QuizLeague {
    public static void main(String[] args) throws IOException {
        BufferedReader fin = new BufferedReader(new FileReader("input.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        StringTokenizer st = new StringTokenizer(fin.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[] b = new boolean[n];
        st = new StringTokenizer(fin.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = (Integer.parseInt(st.nextToken()) == 0);
        }
        int i = k - 1;
        while (b[i]) {
            i++;
            i %= n;
        }
        i++;
        fout.print(i);
        fout.close();

    }
}





