package Acwingbasic.num5;

/**
 * 01背包延申 -> 目标和
 */
public class Dp03 {
    public int findTargetSumWays(int[] nums, int target) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        if (Math.abs(sum) < Math.abs(target)) return 0;
        //dp[i][j] 表示在nums数组中下标为 0~i 中任意搭配 -/+ 获取的方程结果为 j的方法数
        int[][] dp = new int[len][2*sum + 1];

        for (int i = 1; i < len; i++) {
            for (int j = -sum; j < sum; j++) {

            }
        }

        return dp[len-1][target];
    }
}
