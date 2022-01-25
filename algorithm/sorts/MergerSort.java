package sorts;

public class MergerSort {
    static void mergeSort(int i,int j,int[] nums) {
        if (i >= j) return;
        int mid = (i + j) >> 1;
        mergeSort(i,mid,nums);
        mergeSort(mid + 1,j,nums);

        int[] tk = new int[j + 1];
        int k = 0;
        int left_index = i, right_index = mid + 1;
        while (left_index <= mid && right_index <= j){
            if (nums[left_index] < nums[right_index]) {
                tk[k++] = nums[left_index++];
            }else {
                tk[k++] = nums[right_index++];
            }
        }
        while (left_index <= mid) tk[k++] = nums[left_index++];
        while (right_index <= j) tk[k++] = nums[right_index++];

        k = 0;
        for (left_index = i;left_index <= j;left_index++) nums[left_index] = tk[k++];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6,8,4,1,2,5,4,4,4,4,4};
        mergeSort(0,nums.length-1,nums);
        for (int i : nums) System.out.print(i + " ");
    }
}
