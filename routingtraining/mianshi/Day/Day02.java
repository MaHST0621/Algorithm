package Day;

/** tId : 1446
 * 给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
 *
 * 请你返回字符串的能量
 */
public class Day02 {
    public int maxPower(String s) {
        int len = s.length();
        if (len == 0) return 0;
        if (len == 1) return 1;
        char cc = s.charAt(0);
        int max = 0;
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == cc) {
                count++;
                continue;
            }
            max = Math.max(max,count);
            cc = s.charAt(i);
            count = 1;
        }
        return max > count ? max : count;
    }
}
