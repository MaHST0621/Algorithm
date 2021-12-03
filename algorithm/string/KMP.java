package string;

/**
 * @Author Mahe
 * @Date 2021/3/25 9:09
 * @Version 1.0
 */
public class KMP {

    public static boolean solution_KMP(String str1,String str2) {

        if (str1.length() < str2.length()) {
            return false;
        }
        if (str1.equals(str2)) {
            return true;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        return false;
    }

    private static int[] getNext(String p) {
        int len = p.length();
        int[] next = new int[len];
        next[0] = -1;
        int i = 0, k = -1;
        while (i < len - 1) {
            // p[k]表示前缀，p[i]表示后缀
            if (k == -1 || p.charAt(i) == p.charAt(k)) {
                ++k;
                ++i;
                next[i] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        KMP kmp = new KMP();
        String str = "aassdbasddb";
        int[] result = kmp.getNext(str);
        for (int i=0; i < result.length; i++) {
            System.out.println("result[i] = " + result[i]);
        }

    }
}
