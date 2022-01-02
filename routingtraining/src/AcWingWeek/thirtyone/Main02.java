package AcWingWeek.thirtyone;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int ans = 0;
        if (n == 0) {
            System.out.println(1);
            return;
        }

        String nn = String.valueOf(n);
        int len_n = nn.length();
        for (int i = 1; i < len_n; i++) {
            ans += i;
        }

        //满足 1xxxx
        ans = ans + 1;

        for (int i = 1; i < len_n;i++) {
            if (nn.charAt(i) == 1) {
                ans++;
            }else {
                ans += Math.pow(2,len_n - i);
            }
        }
        System.out.println(ans);

    }
}
