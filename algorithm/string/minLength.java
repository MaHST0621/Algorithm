package string;

/**
 * @Author Mahe
 * @Date 2021/3/24 19:06
 * @Version 1.0
 */
  
public class minLength {
    public Integer getMinLength(String str1,String str2) {
        Integer minlen = Integer.MAX_VALUE;

        if (str1.isEmpty() || str2.isEmpty() || str1.length() < str2.length()) {
            return -1;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int[] map = new int[256];

        for (int i = 0; i != str2.length(); i++) {
            map[chars2[i]]++;
        }

        int left=0;
        int right=0;
        int match=str2.length();

        while (right != str1.length()) {
            map[chars1[right]]--;
            if (map[chars1[right]] >= 0) {
                match--;
            }

            if (match == 0) {
                while (map[chars1[left]] < 0) {
                    map[chars1[left++]]++;
                }
                minlen = Math.min(minlen,right - left + 1);
                match++;
                map[chars1[left++]]++;
            }
            right++;
        }



        return minlen;
    }


    public static void main(String[] args) {
        minLength minlength = new minLength();

        String str1 = "abbbcbddcdd";
        String str2 = "abc";

        System.out.println(minlength.getMinLength(str1,str2));
    }
}
