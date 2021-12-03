package algorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Mahe
 * @Date 2021/4/30 18:57
 * @Version 1.0
 */
public class AliTest {
	public int getMinNum(int n, int a[]) {
		Arrays.sort(a);
		int left = 0;
		int right = n-3;
		int[] b = new int[n-1];
		while (left < right) {
			b[left] = a[left] + a[right];
			left++;
			right--;
		}
		b[left+1] = a[n-1];
		b[left+2] = a[n-2];
		Arrays.sort(b);
		return b[b.length - 1] - b[0];
	}

	public static void main(String[] args) {
		AliTest aliTest = new AliTest();
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int a[] = new int[num*2];

		for (int i = 0; i < num*2; i++) {
			a[i] = scanner.nextInt();
		}

		System.out.println(aliTest.getMinNum(num, a));
	}
}