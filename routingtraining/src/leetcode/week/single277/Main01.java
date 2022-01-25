package leetcode.week.single277;

import sun.applet.Main;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums ，统计并返回在 nums 中同时具有一个严格较小元素和一个严格较大元素的元素数目。
 */
public class Main01 {
    public int countElements(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int[] pre_min = new int[nums.length];
        int[] nex_max = new int[nums.length];
        Arrays.fill(pre_min,Integer.MAX_VALUE);
        Arrays.fill(nex_max,Integer.MIN_VALUE);
        for (int i = 1; i < nums.length; i++) {
            pre_min[i] = pre_min[i - 1] > nums[i - 1] ? nums[i - 1] : pre_min[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            nex_max[i] = nums[i + 1] > nex_max[i + 1] ? nums[i + 1] : nex_max[i + 1];
        }
        for (int i = 1; i <= nums.length - 2; i++) {
            if (nums[i] > pre_min[i] && nums[i] < nex_max[i]) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Main01 min = new Main01();
        int[] nums = new int[]{2,7,7,7,11};
        System.out.println(min.countElements(nums));
    }
}
