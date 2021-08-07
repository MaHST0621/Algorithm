package AcWing;

import java.util.*;
/**
 * 单词录入
 */
public class Main03 {
    private static int[] a = new int[110];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count_num = scanner.nextInt();
        int limit = scanner.nextInt();
        int result = 1;
        Arrays.fill(a,0);
        a[0] = scanner.nextInt();
        for (int i = 1; i < count_num; i++) {
            a[i] = scanner.nextInt();
            if (a[i] - a[i-1] > limit)
                result = 0;
            result++;
        }
        System.out.println(result);
    }
}
