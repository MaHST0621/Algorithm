package leetcode.week.double70;

import java.util.Arrays;

/**
 * 一家商店正在打折销售糖果。每购买 两个 糖果，商店会 免费 送一个糖果。
 *
 * 免费送的糖果唯一的限制是：它的价格需要小于等于购买的两个糖果价格的 较小值 。
 *
 * 比方说，总共有 4 个糖果，价格分别为 1 ，2 ，3 和 4 ，一位顾客买了价格为 2 和 3 的糖果，那么他可以免费获得价格为 1 的糖果，但不能获得价格为 4 的糖果。
 * 给你一个下标从 0 开始的整数数组 cost ，其中 cost[i] 表示第 i 个糖果的价格，请你返回获得 所有 糖果的 最小 总开销。
 */
public class Main01 {
    public int minimumCost(int[] cost) {
        int ans = 0;
        int len = cost.length;
        if (len == 1) return cost[0];
        Arrays.sort(cost);
        for (int fi = len - 1; fi >= 0;) {
            ans += cost[fi];
            if (fi - 1 >= 0) {
                ans += cost[fi - 1];
                if (fi - 2 >= 0 && cost[fi - 2] <= cost[fi - 1]) {
                    fi = fi - 3;
                    continue;
                }
            }
            fi = fi - 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        Main01 mi = new Main01();
        int[] nums = new int[]{6,5,7,9,2,2};
        int result = mi.minimumCost(nums);
        System.out.println(result);
    }
}
