package Acwingbasic.num5;

/**
 * 01背包延申问题 -- 分割等和子集
 * 优化： 二维 ->  一维    重点： 滚动数组
 */
public class Dp02 {
    public boolean CanPartition(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        if ((sum & 1) == 1) return false;
        int target = sum >> 1;
        //dp[i][j] 表示 num[0~i] 可以选取和为 j 的数
        //boolean[][] dp = new boolean[len][target+1];
        boolean[] dp = new boolean[target+1];
        //dp[0] 表示只选取nums[0] 的值  那么只要当nums[0] 这个在背包范围（0~target）内就可以成立
        //if(nums[0] <= target) dp[0][nums[0]] = true;

        if (nums[0] <= target) dp[nums[0]] = true;
         for (int i = 1; i < len; i++) {
            //for (int j = 0; j <= target; j++) {
            for (int j = target; j >= nums[i]; j--) {
                //dp[i][j] = dp[i-1][j];
                //if (nums[i] <= j) dp[i][j] = dp[i][j] || dp[i-1][j-nums[i]];
                dp[j] = dp[j] || dp[j-nums[i]];
            }
        }
        return dp[target];

    }
}
