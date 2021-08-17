package AcWing;

/**
 * 最佳连续子数组
 */

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            int max = 0;
            int result = 1;
            for (int i = 0;i < n; i++) {
                p[i] = sc.nextInt();
                if (p[i] > max) max = p[i];
            }
            for (int i = 0;i < n; i++) {
                if (p[i] == max){
                    int j = i + 1;
                    while (j < n && p[j]==max) j++;
                    result = Math.max(result,j-i);
                }
            }
            System.out.println(result);

        }
    }
}
