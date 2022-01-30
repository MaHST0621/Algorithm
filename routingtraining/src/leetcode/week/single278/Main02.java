package leetcode.week.single278;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author：异想天开的咸鱼
 * @date: 2022/1/30
 */
public class Main02 {
    /**
     * 给你一个下标从 0 开始的二进制数组 nums ，数组长度为 n 。nums 可以按下标 i（ 0 <= i <= n ）拆分成两个数组（可能为空）：numsleft 和 numsright 。
     *
     * numsleft 包含 nums 中从下标 0 到 i - 1 的所有元素（包括 0 和 i - 1 ），而 numsright 包含 nums 中从下标 i 到 n - 1 的所有元素（包括 i 和 n - 1 ）。
     * 如果 i == 0 ，numsleft 为 空 ，而 numsright 将包含 nums 中的所有元素。
     * 如果 i == n ，numsleft 将包含 nums 中的所有元素，而 numsright 为 空 。
     * 下标 i 的 分组得分 为 numsleft 中 0 的个数和 numsright 中 1 的个数之 和 。
     *
     * 返回 分组得分 最高 的 所有不同下标 。你可以按 任意顺序 返回答案。
     */
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> check = new ArrayList<>();
        int max =  0;
        int left = 0,right = 0;
        int[] S_right = new int[nums.length + 1];
        S_right[0] = nums[0];
        for (int i = 1;i < nums.length;i++) {
            S_right[i] = S_right[i - 1] + nums[i];
        }
        int res = 0;
        check.add(S_right[nums.length - 1]);
        max = S_right[nums.length - 1];
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] == 0) {
                res++;
            }
            int re = res + S_right[nums.length - 1] - S_right[i];
            check.add(re);
            max = Math.max(max,re);
        }

        for (int i = 0;i < check.size();i++) {
            if (check.get(i) == max) {

                ans.add(i + 1);
            }
        }
        if (ans.isEmpty()) {
            ans.add(0);
        }
        return ans;
    }

    public static void main(String[] args) {
        Main02 main02 = new Main02();

        int[] nums = new int[]{1,0,1,0,1,0};
        main02.maxScoreIndices(nums);
    }
}
