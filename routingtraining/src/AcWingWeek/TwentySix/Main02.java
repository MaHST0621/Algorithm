package AcWingWeek.TwentySix;


import java.util.Scanner;

public class Main02 {

    public static int search(String str) {
        int lo = 1 , hi = str.length() - 1;
        while (lo < hi) {
            int mid = (lo + hi) >> 1;
            if (check(mid,str)) {
                hi = mid;
            }else {
                lo = mid + 1;
            }
        }
        return lo;
    }
    public static boolean check(int k,String str) {
        int len = str.length();
        int count = 0;
        char a = 'a';
        while (count < 26) {
            int ch = a + count++;
            int flag = 0;
            int chCount = 0;
            for (int i = 0; i < len - k + 1; i++ ) {
                if (flag == 0) {
                    String st = str.substring(i,i + k);
                    char[] chs = st.toCharArray();
                    for (char ca : chs) {
                        if (ca == (char)ch) chCount++;
                    }
                    if (chCount == 0) break;
                    flag = 1;
                    continue;
                }
                if (chCount == 0) break;
                if (str.charAt(i - 1) == (char)ch) chCount--;
                if (str.charAt(i + k - 1) == (char)ch) chCount++;
            }
            if (chCount > 0) {
                System.out.println("check point:" + k + " " + (char)ch);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
        //System.out.println(search(ss));
        search(ss);
    }

}
