package AcWing;

import java.util.Scanner;

/**
 * 偶数还是奇数
 */

/**
 * 重点在于： 加减乘 满足以下公式
 *      a*b%2 = (a%2)*(b%2)
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int b = scanner.nextInt();
            int k = scanner.nextInt();
            int result = 0;
            int last = 0;
            for (int i = 0; i < k; i++) {
                last = scanner.nextInt();
                result += last;
            }
            int n = last%2;
            if (b%2 != 0) n = result%2;
            if (n==0) System.out.println("even");
            else System.out.println("odd");
        }
    }
}
