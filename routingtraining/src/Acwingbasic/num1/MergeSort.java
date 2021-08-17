package Acwingbasic.num1;

import java.util.Scanner;

/** 归并排序------分治策略
 * 1.确定分界点： mid = (l+r)/2;
 * 2.递归处理左右分区
 * 3.合并两组有序序列
 */
public class MergeSort {

    private static int[] q;
    private static int[] tk;

    private static void merge_sort(int l,int r) {
        if (l >= r) return;
        int mid = l + r >> 1;
        merge_sort(l,mid);
        merge_sort(mid+1,r);
        int i = l,j = mid + 1,k = 0;
        while (i <= mid && j <= r) {
            if (q[i] <= q[j]) tk[k++] = q[i++];
            else tk[k++] = q[j++];
        }
        while (i <= mid) tk[k++] = q[i++];
        while (j <= r) tk[k++] = q[j++];

        for (i = l,j=0; i <= r;i++,j++) q[i] = tk[j];

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        q = new int[n];
        tk = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = scanner.nextInt();
        }

        merge_sort(0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(q[i] + " ");
        }
    }
}
