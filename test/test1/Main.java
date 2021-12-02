package test1;

import java.util.*;

public class Main{
    private static int x;
    private static int y;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n;i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int i = 0 , j = n - 1;
        while (i < j) {
            int mid = i + j >> 1;
            if (check(mid,n)) {
                j = mid;
            }else {
                i = mid + 1;
            }
        }
        System.out.println(nums[j]);
    }

    public static boolean check(int xx,int n) {
        int tt = xx + 1;
        int jj = n - xx - 1;
        return tt >= x && tt <= y && jj >= x && jj <= y;
    }
}
