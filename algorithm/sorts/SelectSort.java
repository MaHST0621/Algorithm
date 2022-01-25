package sorts;

/**
 * 选择排序
 */
public class SelectSort {
    public static int[] selectSort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len;i++) {
            int ith = i;
            for (int j = i + 1; j < len;j++) {
                if (nums[j] < nums[ith]) {
                    ith = j;
                }
            }
            if (i != ith) {
                System.out.println(nums[i] +  " <--> " + nums[ith]);
                int tmp = nums[i];
                nums[i] = nums[ith];
                nums[ith] = tmp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{100,90,7,6,5,4,1,0};
        selectSort(nums);
        for (int i : nums) System.out.print(i + " ");
    }
}
