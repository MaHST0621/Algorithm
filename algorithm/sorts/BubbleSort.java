package sorts;

public class BubbleSort {
    /**
     * 自带外部循环优化，数组不产生交换就推出遍历
     * @param nums
     */
    public static void bubbleSort(int[] nums) {
        int len = nums.length;
        boolean flag = true;
        int ans = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < len - 1; i++) {
                ans++;
                if (nums[i] > nums[i + 1]) {
                    System.out.println(nums[i] + " <----> " + nums[i+1]);
                    int tmp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tmp;
                    flag=true;
                }
            }
            System.out.println("--------------------------------------------------------");
        }
        System.out.println("总遍历数： " + ans);
    }

    /**
     * 自带内部循环优化，记住最后一次交换index，下一次循环在 0~index。 因为[index , n - 1]是有序的了
     * @param nums
     */
    public static void bubbleSort_level2(int[] nums) {
        int len = nums.length;
        boolean flag = true;
        int ans = 0;
        int index = len - 1;
        while (flag) {
            flag = false;
            int le = index;
            for (int i = 0; i < le; i++) {
                ans++;
                if (nums[i] > nums[i + 1]) {
                    System.out.println(nums[i] + " <----> " + nums[i+1]);
                    int tmp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tmp;
                    index = i;
                    flag=true;
                }
            }
            System.out.println("--------------------------------------------------------");
        }
        System.out.println("总遍历数： " + ans);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,1,5,4,3};
        bubbleSort_level2(nums);
        //bubbleSort(nums);
        for (int i : nums) System.out.print(i + " ");
    }
}
