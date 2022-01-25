package sorts;

public class InsertSort {
    static void insertSort(int[] nums) {
        for (int i = 1; i < nums.length;i++) {
            if (nums[i] < nums[i - 1]) {
                int x = nums[i];
                int j = i - 1;
                //找到需要插入的位置，并把数组中的元素往后移动
                while (j > -1 && x < nums[j]) {
                    nums[j + 1] = nums[j];
                    --j;
                }
                nums[j + 1] = x;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,1,3,2};
        insertSort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
