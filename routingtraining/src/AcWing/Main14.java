package AcWing;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 移动元素
 */
public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] num = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                num[i] = scanner.nextInt();
                sum += num[i];
            }

            Arrays.sort(num);

            if (sum % 2 == 0) {
                int x = sum >> 1;
                int k = 0;
                for (int i = 0; i < n; i++) {
                    if (num[i] > x) {
                        System.out.println("No");
                        break;
                    }
                    if (num[i] == x) {
                        System.out.println("YES");
                        break;
                    }
                    k += num[i];
                }
            }else {
                System.out.println("No");
            }

        }
    }
}
