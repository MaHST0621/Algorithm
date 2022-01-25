package atcoder.at1;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String kk = String.valueOf(k);
        char[] char_kk = kk.toCharArray();
        int len = kk.length();
        int max_kk = 0x8000000;
        for (int i = 1; i < len; i++) {
            int res = Character.getNumericValue(char_kk[i]) - Character.getNumericValue(char_kk[i - 1]);

        }
    }
}
