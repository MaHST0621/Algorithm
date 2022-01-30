package leetcode.week.single278;

import sun.applet.Main;

import java.util.HashMap;

/**
 * @description:
 * @author：异想天开的咸鱼
 * @date: 2022/1/30
 */
public class Main01 {
    /**
     * 给你一个整数数组 nums ，另给你一个整数 original ，这是需要在 nums 中搜索的第一个数字。
     *
     * 接下来，你需要按下述步骤操作：
     *
     * 如果在 nums 中找到 original ，将 original 乘以 2 ，得到新 original（即，令 original = 2 * original）。
     * 否则，停止这一过程。
     * 只要能在数组中找到新 original ，就对新 original 继续 重复 这一过程。
     * 返回 original 的 最终 值。
     */
    public int findFinalValue(int[] nums, int original) {
        int ans = original;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i],i);
        }
        while (map.containsKey(ans)) {
            ans <<= 1;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
