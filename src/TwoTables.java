import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoTables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> arrayList;
        List<Integer> arrayList2;
        int w, h, x1, x2, y1, y2, a, b, wd, hd, c, d;

        int n = in.nextInt();
        while (n > 0) {
            boolean flag = true;


            arrayList = new ArrayList<Integer>(2);
            arrayList2 = new ArrayList<Integer>(2);
            w = in.nextInt();
            h = in.nextInt();
            x1 = in.nextInt();
            y1 = in.nextInt();
            x2 = in.nextInt();
            y2 = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
            wd = Math.abs(x2 - x1);
            hd = Math.abs(y2 - y1);

            if (a + wd <= w || b + hd <= h) {
                if (a + wd <= w) {
                    if (a > x1)
                        c = a - x1;
                    else c = 0;

                    arrayList.add(c);
                    x2 = w - x2;
                    if (a > x2)
                        c = a - x2;
                    else
                        c = 0;
                    arrayList.add(c);
                }
                if (b + hd <= h) {
                    if (b > y1)
                        d = b - y1;
                    else d = 0;

                    arrayList2.add(d);
                    y2 = h - y2;
                    if (b > y2)
                        d = b - y2;
                    else
                        d = 0;
                    arrayList2.add(d);
                }
            } else {
                System.out.println(-1);
                flag = false;
            }
            if (flag) {
                Collections.sort(arrayList);
                Collections.sort(arrayList2);
                if (arrayList.isEmpty() == false && arrayList2.isEmpty() == false) {
                    if (arrayList.get(0) > arrayList2.get(0))
                        System.out.println(arrayList2.get(0));
                    else
                        System.out.println(arrayList.get(0));
                } else if (arrayList.isEmpty() == false && arrayList2.isEmpty() == true)
                    System.out.println(arrayList.get(0));
                else if (arrayList.isEmpty() == true && arrayList2.isEmpty() == false)
                    System.out.println(arrayList2.get(0));


            }
            n--;
        }

    }

}
