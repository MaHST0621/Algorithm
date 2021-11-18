package src;

import java.util.Scanner;

public class MeiTuan01 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        int res = 0;

        int len = str.length();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                int num = Integer.parseInt(str.substring(i,j));
                if (num % 22 == 0) res++;
            }
        }
        System.out.println(res);
    }
}
