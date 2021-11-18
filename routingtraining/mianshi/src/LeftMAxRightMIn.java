import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class LeftMAxRightMIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] leftMax = new int[n];
        int[] RightMin = new int[n];
        int[] nums = new int[n];

        Arrays.fill(RightMin,Integer.MAX_VALUE);
        Arrays.fill(leftMax,Integer.MIN_VALUE);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1],nums[i-1]);
        }

        for (int i = n-2; i >= 0; i--) {
            RightMin[i] = Math.min(RightMin[i+1],nums[i+1]);
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > leftMax[i] && RightMin[i] > nums[i]) {
                stack.push(nums[i]);
            }
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
