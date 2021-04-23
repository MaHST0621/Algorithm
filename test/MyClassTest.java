package test;

/**
 * @Author Mahe
 * @Date 2021/4/21 16:44
 * @Version 1.0
 */
class MyClassTest01 {
	public int i = 5;
	public static int j = 5;

	public static void sout() {
		System.out.println(j * j);
	}
}

class MyClassTest02{
	public static int j = 6;

	public static void sout() {
		System.out.println(j * j);
	}
}

public class MyClassTest {
	public static void main(String[] args) {
		Integer i = 15;

		Class C1 = i.getClass();
		System.out.println("C1 = " + C1);

		Class C2 = MyClassTest01.class;
		System.out.println("C2 = " + C2);
	}
}
