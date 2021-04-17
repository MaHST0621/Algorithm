package algorithm;

/**
 * @Author Mahe
 * @Date 2021/4/16 18:13
 * @Version 1.0
 */
public class tengxun01 {

	private int lev = 1;

//	public String compress (String str) {
//		// write code here
//
//		int length = str.length();
//		int cw = 0;
//		int count = 0;
//		String result = "";
//
//		while (length-- > 0 && cw + 1 < 11) {
//			char str11 = str.charAt(cw++);
//			if ('[' == str11) {
//				count++;
//				int tt = cw + 2;
//				for (int i = 0; i < 6 ; i++) {
//					while (count != 0) {
//						if (']' == str.charAt(tt)) {count--;}
//						result = result +
//					}
//				}
//			}
//			}
//		return result;
//	}

	public static void main(String[] args) {
		String str = "[1|ad[5|mm]]";

		tengxun01 tengxun01 = new tengxun01();
		System.out.println(str.indexOf('a'));

//		Integer a = new Integer(89);
//		Integer b = new Integer(89);

		Integer a = 89;
		Integer b = 89;


		Integer ab = new Integer(189);
		Integer ba = new Integer(189);

		System.out.println(a == b);
		System.out.println(ab == ba);

		System.out.println(ab.hashCode() + " " + ba.hashCode());

	}
}
