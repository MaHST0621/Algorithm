package test;

import java.util.HashMap;

/**
 * @Author Mahe
 * @Date 2021/4/26 14:03
 * @Version 1.0
 */
public class StringValueTest {
	public static void main(String[] args) {
		testValueAPIs() ;
	}

	/**
	 * String 的valueOf()演示程序
	 */
	private static void testValueAPIs() {
		System.out.println("-------------------------------- testValueAPIs --------------------------------");
		// 1. String    valueOf(Object obj)
		//  实际上，返回的是obj.toString();
		HashMap map = new HashMap();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		System.out.printf("%-50s = %s\n", "String.valueOf(map)", String.valueOf(map));

		// 2.String    valueOf(boolean b)
		System.out.printf("%-50s = %s\n", "String.valueOf(true)", String.valueOf(true));

		// 3.String    valueOf(char c)
		System.out.printf("%-50s = %s\n", "String.valueOf('m')", String.valueOf('m'));

		// 4.String    valueOf(int i)
		System.out.printf("%-50s = %s\n", "String.valueOf(96)", String.valueOf(96));

		// 5.String    valueOf(long l)
		System.out.printf("%-50s = %s\n", "String.valueOf(12345L)", String.valueOf(12345L));

		// 6.String    valueOf(float f)
		System.out.printf("%-50s = %s\n", "String.valueOf(1.414f)", String.valueOf(1.414f));

		// 7.String    valueOf(double d)
		System.out.printf("%-50s = %s\n", "String.valueOf(3.14159d)", String.valueOf(3.14159d));

		// 8.String    valueOf(char[] data)
		System.out.printf("%-50s = %s\n", "String.valueOf(new char[]{'s','k','y'})", String.valueOf(new char[]{'s','k','y'}));

		// 9.String    valueOf(char[] data, int offset, int count)
		System.out.printf("%-50s = %s\n", "String.valueOf(new char[]{'s','k','y'}, 0, 2)", String.valueOf(new char[]{'s','k','y'}, 0, 2));

		System.out.printf("%-50s = %s\n", "String.valueOf(new char[]{'s','k','y'}, 0, 2)", String.valueOf(new char[]{'s','k','y'}, 0, 2));

		System.out.println();
	}
}
