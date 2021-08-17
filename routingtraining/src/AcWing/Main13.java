package AcWing;

import java.util.Scanner;

/**
 * 消灭数组
 */
public class Main13 {
    private static int[] p;
    private static int t;
    public static void check(int l,int r) {
        int i = l;
        int j = r;
        int mid = (l + r >> 1);
        int k = mid + 1;
        int re_l = 1;
        int re_r = 1;
        while (i < k) {
            int re = 1;
            while (p[i++] <= p[i] && i < k) re++;
            re_l = Math.max(re,re_l);
        }
        while (j >= k) {
            int re = 1;
            while (p[j--] >= p[j] && k <= j) re++;
            re_r = Math.max(re,re_r);
        }
        if ((re_l+re_r) == r+1 && p[k] >= p[k-1])
        {
            System.out.println(r+1);
            return;
        }
        if (re_l >= re_r) {
            check(l,mid);
        } else check(mid,r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            if (n==1) {
                System.out.println(1);
                return;
            }
            p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            check(0,n-1);
        }
    }
}
