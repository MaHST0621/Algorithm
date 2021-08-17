package AcWing;

import java.util.Scanner;

/**
 * 点
 */
public class Main08 {
    private static long[] x;
    private static long[] y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int T=t;
        x = new long[t];
        y = new long[t];
        int r1 = 0,r2 = 0;
        long result = 0;


        int index = 0;
        while (T-- > 0) {
            x[index] = scanner.nextLong();
            y[index++] = scanner.nextLong();
        }

        for (int i = 0; i < t; i++) {
            r1 += x[i]*x[i];
            r2 += x[i];
        }
        result += (t-1)*r1 - (r2*r2 - r1);

        r1 = 0; r2 = 0;
        for (int i = 0; i < t; i++) {
            r1 += y[i]*y[i];
            r2 += y[i];
        }
        result += (t-1)*r1 - (r2*r2 - r1);

        System.out.print(result);
    }
}
