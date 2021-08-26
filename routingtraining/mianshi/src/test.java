import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[m];

        for (int i = 0; i < m; i++) {
            nums[i] = scanner.nextInt();
        }

    }
}
