package test;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @Author Mahe
 * @Date 2021/4/28 14:22
 * @Version 1.0
 */
@SuppressWarnings({"all"})
public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap map = new TreeMap(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((String)o2).length() - ((String) o1).length();
			}
		});

		map.put("ack","杰克");
		map.put("blusi","路西");
		map.put("cmark","马克");

		System.out.println("treemap" + map);
	}
}

