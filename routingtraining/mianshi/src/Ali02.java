package src;

import java.util.Scanner;

public class Ali02 {
    private static boolean[] use;
    private static int path = 0;
    private static int res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        use = new boolean[n];
        int[] nums = new int[n];
        int[] dr = new int[k + 1];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        dfs(k, nums, dr);
        //System.out.println(dfs(k, nums, dr));

    }

    public static  void dfs(int u,int nums[],int dr[]) {
        if (u == path) {
            res++;
            return;
        }
        for (int i = 0;i < nums.length;i++) {
            if (!use[i] && dr[path] < nums[i]) {
                use[i] = true;
                dr[++path] = nums[i];
                dfs(u,nums,dr);
                use[i] = false;
                path--;
            }
        }
    }
}
