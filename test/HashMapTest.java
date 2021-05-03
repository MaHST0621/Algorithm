package test;

import java.util.HashMap;

/**
 * @Author Mahe
 * @Date 2021/4/27 15:17
 * @Version 1.0
 */
@SuppressWarnings({"all"})
public class HashMapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap();

		map.put("test",1);
		map.put("",5);
		map.put("aaa",2);
	}
}

class A {
	private int num;

	public A(int num){
		this.num = num;
	}

	@Override
	public int hashCode() {
		return 100;
	}
}
