package algorithm;

/**
 * @Author Mahe
 * @Date 2021/4/13 15:33
 * @Version 1.0
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 二分查找
 */
public class binsearch {
	private ArrayList<Integer> arrayList;

	public binsearch (ArrayList<Integer> arrayList) {
		this.arrayList = arrayList;
	}

	int getSearch01(int num,int lo,int hi) { //初代版本
		int mid = (lo + hi) >> 1;
		while (lo < hi) {
			if (num < arrayList.get(mid)) {mid = hi;return getSearch01(num,lo,hi);}
			else if (arrayList.get(mid) < num) {mid = lo;return getSearch01(num,lo,hi);}
			else
				return mid;
		}
		return -1;
	}

	int getSearch02(int num,int lo,int hi) { //牺牲尽早命中目标的可能性，达到每次都值只比较一次的公平性
		int mid = (lo + hi) >> 1;

		if (num < arrayList.get(mid)) {hi = mid;}
		else {lo = mid;}
		return (num == arrayList.get(lo)) ? lo : -1;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			arrayList.add(i + 1);
		}

		binsearch binsearch = new binsearch(arrayList);
		int num = scanner.nextInt();

		System.out.println(binsearch.getSearch02(num, 0, 9));
	}
}
