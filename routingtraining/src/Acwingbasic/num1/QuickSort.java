package Acwingbasic.num1;

/** 快排模板-----分治
 * 1.确定分界点 x： q[l] , q[(l+r)/2] , q[r]
 * 2.调整区间，使得 左半区间小于等于 x 右半区间大于
 * 3.递归处理左右区间
 */

import java.util.Scanner;

/** 调整区间-----双指针
 * 1.最初设定 q[0] = i; q[q.lengt-1] = j;
 * 2.两个指针（i在小于x，j在大于x时） 相向移动，当不满足该条件时两指针停下来并且满足这两个指针没有相遇过 交换swap(q[i],q[j])
 */
public class QuickSort {
    private static int q[];

    private static void quick_sort(int l,int r) {
        if (l >= r) return;
        int x = q[l];
        int i = l - 1;
        int j = r + 1;

        while (i < j) {
            do ++i ;while(q[i] < x);
            do --j ;while(q[j] > x);
            if (i < j) {
                int smp = q[i];
                q[i] = q[j];
                q[j] = smp;
            }
        }
        quick_sort(l,j);
        quick_sort(j+1,r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        q = new int[N];
        for (int i = 0; i < N; i++) {
            q[i] = scanner.nextInt();
        }
        quick_sort(0,N-1);
        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
        }
    }
}
