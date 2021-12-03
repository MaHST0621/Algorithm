package algorithm;

import java.util.Scanner;

/**
 * @Author Mahe
 * @Date 2021/4/13 15:29
 * @Version 1.0
 */

/**
 * 最优斐波那契数列算法 时间：O（0） 空间：O（1）
 */
public class fibo {

	int getFiBo(int n) {
		int f = 0,g = 1;
		if (n == 0) {return 0;}
		while (0 < --n) {
			g = f + g;
			f = g - f;
		}
		return g;
	}

	public static void main(String[] args) {
		fibo fibo = new fibo();

		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();

		System.out.println(fibo.getFiBo(count));
	}
}
