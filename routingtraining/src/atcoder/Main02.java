package atcoder;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        String res = Long.toBinaryString(k);
        int len = res.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (res.charAt(i) == '1') {
                ans.append('2');
            }else {
                ans.append('0');
            }
        }
        ans.toString();
        System.out.println(ans);
    }
}
