package AcWing;

import java.util.*;

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
            int cur = 0; //计算数组前缀和
            boolean cheak = false;

            for (int i = 0; i < n; i++) {
                num[i] = scanner.nextInt();
                sum += num[i];
            }

            Set<Integer> set = new HashSet<>();
            //正序遍历数组
            for (int i = 0; i < n; i++) {
                cur += num[i];
                set.add(num[i]);

                if (cur == sum - cur) {
                    cheak = true;
                    break;
                }

                if (cur > sum - cur) {
                    int x = cur - (sum >> 1);
                    if (set.contains(x)) {
                        cheak = true;
                        break;
                    }
                }
            }
            if (cheak == true) {
                System.out.println("YES");
                break;
            }

            //逆序化数组并遍历
            Collections.reverse(Collections.singletonList(num));
            for (int i = 0; i < n; i++) {
                cur += num[i];
                set.add(num[i]);

                if (cur == sum - cur) {
                    System.out.println("YES");
                    break;
                }

                if (cur > sum - cur) {
                    int x = cur - sum >> 1;
                    if (set.contains(x)) {
                        System.out.println("YES");
                        break;
                    }
                }
            }
            if (cheak == true) {
                System.out.println("YES");
                break;
            }
            System.out.println("No");
        }
    }
}
