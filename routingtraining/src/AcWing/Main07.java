package AcWing;

import java.util.Scanner;

/**
 * 幸运年份
 */
public class Main07 {
    private static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            N = scanner.nextInt();

            String str = String.valueOf(N);
            int num = str.length();
            if (num == 1) System.out.println(1);
            else
            {
                num = (int) Math.pow(10,num-1);
                int a = str.charAt(0) - '0' + 1;
                int result = num*(a+1) - N;
                if (result == 0) System.out.println(1);
                else System.out.println(result);
            }
        }
    }
}
