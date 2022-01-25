package atcoder.at3;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int len = N << 2;
        int[] nums = new int[len];
        int[] check = new int[N];
        int ans = 0;
        for (int i = 0; i < len - 1; i++) {
            nums[i] = sc.nextInt();
            check[nums[i] - 1]++;
        }
        for (int i = 0; i < N; i++) {
            if (check[i] != 4) {
                ans = i;
                break;
            }
        }
        System.out.println(ans + 1);
    }
}
