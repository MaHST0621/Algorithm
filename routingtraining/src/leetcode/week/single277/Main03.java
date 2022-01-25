package leetcode.week.single277;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 给你一个整数数组 nums 。如果数字 x 在数组中仅出现 一次 ，且没有 相邻 数字（即，x + 1 和 x - 1）出现在数组中，则认为数字 x 是 孤独数字 。
 *
 * 返回 nums 中的 所有 孤独数字。你可以按 任何顺序 返回答案。
 *
 *
 */
public class Main03 {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))  {
                int co = map.get(nums[i]);
                if (co != -1) {
                    map.put(nums[i],-1);
                }
            }else {
                map.put(nums[i],0);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.get(num) != -1 && !map.containsKey(num + 1) && !map.containsKey(num - 1)) ans.add(num);
        }
        return ans;
    }
}
