package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author Mahe
 * @Date 2021/4/24 19:22
 * @Version 1.0
 */
public class JingDongTest {

	public void get(int n, int m,ArrayList<Integer> all ) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

		for (int i : all) {
			if (!map.containsKey(i)) {
				map.put(i,0);
			} else {
				map.put(i,map.get(i) + 1);
			}
		}

		int max = 0;
		int index = 0;
		for (int i : map.keySet()) {
			if (max < map.get(i)) {
				max = map.get(i);
				index = i;
			}
		}
		max = max + 1;
		System.out.println(index + " " + max);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n_count = scanner.nextInt();
		int m_gift = scanner.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>(n_count);
		for (int i = 0; i < n_count; i++) {
			int j = scanner.nextInt();
			list.add(j);
		}

		JingDongTest jingDongTest = new JingDongTest();
		jingDongTest.get(n_count,m_gift,list);

	}

}
