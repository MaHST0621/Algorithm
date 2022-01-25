package leetcode.week.single277;

/**
 * 给你一个下标从 0 开始的整数数组 nums ，数组长度为 偶数 ，由数目相等的正整数和负整数组成。
 *
 * 你需要 重排 nums 中的元素，使修改后的数组满足下述条件：
 *
 * 任意 连续 的两个整数 符号相反
 * 对于符号相同的所有整数，保留 它们在 nums 中的 顺序 。
 * 重排后数组以正整数开头。
 * 重排元素满足上述条件后，返回修改后的数组。
 */
public class Main02 {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int[] zh = new int[nums.length >> 1];
        int[] fu = new int[nums.length >> 1];
        int z = 0, f = 0;
        for (int i : nums) {
            if (i > 0) zh[z++] = i;
            if (i < 0) fu[f++] = i;
        }
        z = 0 ;
        f = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 || i == 0) {ans[i] = zh[z++];}
            else {ans[i] = fu[f++];}
        }

        return ans;
    }
}
