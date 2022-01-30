package leetcode.week.single278;

import java.util.HashMap;

/**
 * @description:
 * @author：异想天开的咸鱼
 * @date: 2022/1/30
 */
public class Main03 {
    /**
     * 给定整数 p 和 m ，一个长度为 k 且下标从 0 开始的字符串 s 的哈希值按照如下函数计算：
     *
     * hash(s, p, m) = (val(s[0]) * p0 + val(s[1]) * p1 + ... + val(s[k-1]) * pk-1) mod m.
     * 其中 val(s[i]) 表示 s[i] 在字母表中的下标，从 val('a') = 1 到 val('z') = 26 。
     *
     * 给你一个字符串 s 和整数 power，modulo，k 和 hashValue 。请你返回 s 中 第一个 长度为 k 的 子串 sub ，满足 hash(sub, power, modulo) == hashValue 。
     *
     * 测试数据保证一定 存在 至少一个这样的子串。
     *
     * 子串 定义为一个字符串中连续非空字符组成的序列。
     */
    public String subStrHash(String s, int power, int modulo, int k, int hashValue) {
        if (k == s.length()) {return s;}
        return hash(s,0,k-1,power,modulo,hashValue);
    }

    int val(char ch) {
        return ch - 'a' + 1;
    }

    String hash(String s,int le,int right,int power,int module,int check) {
        long res = 0;
        int i = le,j = right;
        while (i != j + 1) {
            res = (long) (res + val(s.charAt(i))*Math.pow(power,i));
            i++;
        }
        if (res % module == check) {
            return s.substring(le,right+1);
        }
        while (right != s.length() - 1) {
            res -= (val(s.charAt(le))*Math.pow(power,le++));
            res += (val(s.charAt(++right))*Math.pow(power,right));

            int cc = (int) (res % module);
            if (cc == check) {
                return s.substring(le,right+1);
            }
            res %= module;
        }
        return "";
    }

    public static void main(String[] args) {
        Main03 main03 = new Main03();
        String s = "xxterzixjqrghqyeketqeynekvqhc";
        int power = 15;
        int modulo = 94;
        int k = 4;
        int hashValue = 16;
        main03.subStrHash(s, power, modulo, k, hashValue);
    }
}
