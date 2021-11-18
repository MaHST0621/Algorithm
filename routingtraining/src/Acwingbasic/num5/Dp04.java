package Acwingbasic.num5;

import java.util.ArrayList;

/**
 * 接雨水
 */
public class Dp04 {
    /**
     * 暴力模拟  按行来求
     * @param height
     * @return
     */
    public int trap01(int[] height) {
        int len = height.length;
        int result = 0;
        int max = 1;
        while (max-- > 0) {
            int i = 0;
            max = 0;
            while (i < len) {
                while ( i < len&&height[i] == 0) i++;
                if (i >= len) return result;
                while (i < len && height[i] != 0) {
                    height[i]--;
                    max = Math.max(height[i],max);
                    i++;
                }
                int start = 0;
                while (i < len && height[i] == 0) {
                    start++;
                    i++;
                }
                if (i == len && height[len-1] == 0) start = 0;
                result += start;
            }

        }

        return result;
    }

    /**
     * 动态规划
     * 模拟 应left_max[i]  和 right_max[i] 保存不包含该点的 两侧最高墙高
     * 按列求
     * @param height
     * @return
     */
    public int trap02(int[] height) {
        int len = height.length;
        int result = 0;
        if (len == 0 || len == 1) return result;
        int max = 0;
        int[] left_max = new int[len];
        int[] right_max = new int[len];
        for (int i = 1; i < len; i++) {
            max = Math.max(max,height[i-1]);
            left_max[i] = max;
        }
        max = 0;
        for (int i = len - 2; i >= 0; i--) {
            max = Math.max(max,height[i+1]);
            right_max[i] = max;
        }
        for (int i = 0; i < len; i++) {
            int val = Math.min(left_max[i],right_max[i]);
            if (val < height[i]) continue;
            result += val - height[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        Dp04 dp04 = new Dp04();
        dp04.trap02(nums);
    }
}
