package leetcode.week.single275;

public class Main02 {
    public int minSwaps(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int len = nums.length;
        int count_one = 0;
        for (int i : nums) {
            if (i == 1) {
                ++count_one;
            }
        }
        //构建循环数组
        int[] roundNums = new int[len * 2];
        for (int i = 0; i < len; i++) {
            roundNums[i] = nums[i];
            roundNums[i + len] = nums[i];
        }
        len = roundNums.length;
        int res = 0;
        for (int i = 0; i < count_one; i++) {
            if (roundNums[i] == 1) {
                ++res;
            }
        }
        for (int i = count_one; i < len;i++) {
            res += roundNums[i] - roundNums[i - count_one];
            ans = Math.min(ans,count_one - res);
        }
        return ans;
    }

    public static void main(String[] args) {
        final Main02 main02 = new Main02();
        int[] nums = {1,1,0,0,1,1,0,0,1};
        int res = main02.minSwaps(nums);
        System.out.println(res);
    }
}
