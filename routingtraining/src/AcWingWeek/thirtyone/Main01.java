package AcWingWeek.thirtyone;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int[] p = new int[4];
        int min_in_p = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < 4;i++) {
            p[i] = scanner.nextInt();
            min_in_p = p[i] < min_in_p ? p[i] : min_in_p;
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b < min_in_p) {
            ans = b - a;
        }else {
            ans = min_in_p -a > 0 ? min_in_p - a : 0;
        }
        System.out.println(ans);
    }
}
