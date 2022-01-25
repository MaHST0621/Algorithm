package sorts;

public class QuickSoert {
    static void quick_sort(int i,int j,int[] nums) {
        if (i >= j) return;
        int x = nums[i];
        int le = i - 1 , ri = j + 1;

        while (le < ri) {
            do {le++;}while(nums[le] < x);
            do {ri--;}while(nums[ri] > x);

            if (le < ri) {
                int tmp = nums[le];
                nums[le] = nums[ri];
                nums[ri] = tmp;
            }
        }

        quick_sort(i,ri,nums);
        quick_sort(ri + 1,j,nums);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,8,1,2,6,5};
        quick_sort(0,nums.length - 1,nums);

        for (int i : nums) System.out.println(i);
    }
}
