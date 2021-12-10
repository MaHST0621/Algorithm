package Day;

import java.util.HashMap;

/**
 * 689
 */
public class Day04 {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int len = nums.length;
        int[] sum_index =  new int[len];
        for (int i = 0; i < k;i++) {
            sum_index[0] += nums[i];
        }
        for (int i = 1; i <= len - k; i++) {
            sum_index[i] = sum_index[i - 1] - nums[i - 1] + nums[i + k - 1];
        }
        len = sum_index.length;
        int[][] dp = new int[len + 1][4];

        return new int[]{100};
    }

    public static void main(String[] args) {
        Day04 day04 = new Day04();
        int[] nums = new int[]{1,2,1,2,6,7,5,1};
        int k = 2;
        int[] res = day04.maxSumOfThreeSubarrays(nums,k);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
