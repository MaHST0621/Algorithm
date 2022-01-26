package basick.binarysearch;

/**
 * @description: 二分搜索板子
 * @author：异想天开的咸鱼
 * @date: 2022/1/26
 */
public class BinarySearch {

    /**
     * 查找nums 中的k的下标
     * @param nums
     * @param k
     */
    static int binarySearch_1(int[] nums,int k) {
        int l = 0 , r = nums.length - 1;
        while (l < r) {
            int mid = l + r + 1>> 1;
            if (nums[mid] == k) {
                return mid;
            }else if (nums[mid] > k) {
                r = mid - 1;
            }else if (nums[mid] < k) {
                l = mid;
            }
        }
        return -1;
    }

    /**
     * 返回数组的区间
     * @param nums 查询数组
     * @param query 访问数字
     */
    static void binarySearch_2(int[] nums,int[] query) {
        for (int i = 0; i < query.length; i++) {
            int num = query[i];
            int l = 0 , r = nums.length - 1;
            while (l < r) {
                //左边界
                int mid = (l + r) >> 1;
                if (nums[mid] >= num) {r = mid;}
                else {l = mid + 1;}
            }
            if (nums[l] != num) {
                System.out.println(-1 + " " + -1);
            }else {
                System.out.print(l + " ");
                l = 0;
                r = nums.length - 1;
                //右边界
                while (l < r) {
                    //因为l = mid (求右边界) 所以要加1
                    //当 l = r - 1时 会出现死循环
                    int mid = (l + r + 1) >> 1;

                    if (nums[mid] <= num) {l = mid;}
                    else {r = mid - 1;}
                }
                System.out.println(l);
            }
        }
    }

    static void binarySearch_3(double n) {
        double l = 0 , r = n;
        while (r- l > Math.pow(10,-6)) {
            double mid = (l + r) / 2;
            if (mid * mid >= n) {r = mid;}
            else {l = mid;}
        }
        System.out.println(l);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,5,5,6,6,7,8,9,10,11};
        int[] query = new int[]{11,5,6,7};
        binarySearch_2(nums,query);
        System.out.println(binarySearch_1(nums,0));
        binarySearch_3(100.00);
    }
}
