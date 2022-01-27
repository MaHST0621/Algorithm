package basick.binarysearch;

/**
 * @description: 反转数组中找target
 * @author：异想天开的咸鱼
 * @date: 2022/1/27
 */
public class ReverseNums {
    /**
     * 思路 ： 只要关注有序的一侧就可以，如果target不在有序另一侧的话 就找另一侧
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0,right = len - 1;

        while (left <= right) {
            int mid = (left + right ) >> 1;

            if (nums[mid] == target) {return mid;}
            //前半部分有序
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] > target) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
                //后半部分有序
            }else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ReverseNums n = new ReverseNums();
        int[] nums = new int[]{4,5,6,7,0,1,2};
        n.search(nums,0);
    }
}
