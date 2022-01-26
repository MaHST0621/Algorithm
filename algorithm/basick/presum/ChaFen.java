package basick.presum;

/**
 * @description: 差分板子
 * @author：异想天开的咸鱼
 * @date: 2022/1/26
 */
public class ChaFen {
    static int[] b;
    static void insert(int left,int right,int c) {
        b[left] += c;
        b[right + 1] -= c;
    }

    static void chaFen(int[] nums,int[] query) {
        b = new int[nums.length + 10];
        for (int i = 0; i < nums.length;i++) {
            insert(i,i,nums[i]);
        }
        for (int i = 0;i < query.length;) {
            int l = query[i++] , r = query[i++],c = query[i++];
            insert(l,r,c);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,1,2,1};
        int[] query = new int[]{1,3,1,3,5,1,1,6,1};
        chaFen(nums,query);
    }
}
