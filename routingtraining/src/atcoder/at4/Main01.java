package atcoder.at4;

import java.util.Scanner;

/**
 * @description:
 * @author：异想天开的咸鱼
 * @date: 2022/1/30
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        double check = Math.pow(2,31);
        if (num > (check - 1) || num < -check) {
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
