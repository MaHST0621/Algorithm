package atcoder.at4;

import java.util.Scanner;

/**
 * @description:
 * @author：异想天开的咸鱼
 * @date: 2022/1/30
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int[][] ans = new int[W][H];
        for (int i = 0;i < H;i++) {
            for (int j = 0;j < W;j++) {
                ans[j][i] = scanner.nextInt();
            }
        }

        for (int i = 0;i < W;i++) {
            for (int j = 0;j < H;j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
