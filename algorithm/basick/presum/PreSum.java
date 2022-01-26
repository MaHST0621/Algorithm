package basick.presum;

/**
 * @description:
 * @author：异想天开的咸鱼
 * @date: 2022/1/26
 */
public class PreSum {

    static void preSum(int[] nums,int[] query) {
        int[] S = new int[nums.length + 1];
        for (int i = 0;i < nums.length;i++) {
            S[i + 1] += nums[i] + S[i];
        }

        for (int i = 0; i < query.length;i++) {
            int left = query[i];
            int right = query[++i];

            System.out.printf("[%d,%d]之间的和%d\n",left,right,S[right] - S[left]);
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        int[] query = new int[]{0,8,3,5};
        preSum(nums,query);
    }
}
