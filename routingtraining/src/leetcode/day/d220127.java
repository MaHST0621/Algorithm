package leetcode.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description: 2047. 句子中的有效单词数
 * @author：异想天开的咸鱼
 * @date: 2022/1/27
 */
public class d220127 {
    /**
     * 句子仅由小写字母（'a' 到 'z'）、数字（'0' 到 '9'）、连字符（'-'）、标点符号（'!'、'.' 和 ','）以及空格（' '）组成。每个句子可以根据空格分解成 一个或者多个 token ，这些 token 之间由一个或者多个空格 ' ' 分隔。
     * 如果一个 token 同时满足下述条件，则认为这个 token 是一个有效单词：
     * 仅由小写字母、连字符和/或标点（不含数字）。
     * 至多一个 连字符 '-' 。如果存在，连字符两侧应当都存在小写字母（"a-b" 是一个有效单词，但 "-ab" 和 "ab-" 不是有效单词）。
     * 至多一个 标点符号。如果存在，标点符号应当位于 token 的 末尾 。
     * 这里给出几个有效单词的例子："a-b."、"afad"、"ba-c"、"a!" 和 "!" 。
     *
     * 给你一个字符串 sentence ，请你找出并返回 sentence 中 有效单词的数目 。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/number-of-valid-words-in-a-sentence
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int countValidWords(String sentence) {
        int ans = 0;
        String[] token = sentence.split(" ");
        for (String s : token) {
            if (check(s)) {
                ans++;
            }
        }
        return ans;
    }

    public boolean check(String s) {
        if (s == null || s.length() == 0) {return false;}
        int len = s.length();
        for (int i = 0;i < s.length();i++) {
            char c = s.charAt(i);
            if (c == '-' && (i == 0 || i == len - 1)) {return false;}
            if (c >= '1' && c <= '9') {return false;}
            if ( (c == '!' || c == '.' || c == ',') && i != len - 1) {return false;}
            if (c >= 'A' && c <= 'Z') {return false;}
        }
        return true;
    }

    public static void main(String[] args) {
        d220127 s = new d220127();
        String st = " 62   nvtk0wr4f  8 qt3r! w1ph 1l ,e0d 0n 2v 7c.  n06huu2n9 s9   ui4 nsr!d7olr  q-, vqdo!btpmtmui.bb83lf g .!v9-lg 2fyoykex uy5a 8v whvu8 .y sc5 -0n4 zo pfgju 5u 4 3x,3!wl  fv4   s  aig cf j1 a i  8m5o1  !u n!.1tz87d3 .9    n a3  .xb1p9f  b1i a j8s2 cugf l494cx1! hisceovf3 8d93 sg 4r.f1z9w   4- cb r97jo hln3s h2 o .  8dx08as7l!mcmc isa49afk i1 fk,s e !1 ln rt2vhu 4ks4zq c w  o- 6  5!.n8ten0 6mk 2k2y3e335,yj  h p3 5 -0  5g1c  tr49, ,qp9 -v p  7p4v110926wwr h x wklq u zo 16. !8  u63n0c l3 yckifu 1cgz t.i   lh w xa l,jt   hpi ng-gvtk8 9 j u9qfcd!2  kyu42v dmv.cst6i5fo rxhw4wvp2 1 okc8!  z aribcam0  cp-zp,!e x  agj-gb3 !om3934 k vnuo056h g7 t-6j! 8w8fncebuj-lq    inzqhw v39,  f e 9. 50 , ru3r  mbuab  6  wz dw79.av2xp . gbmy gc s6pi pra4fo9fwq k   j-ppy -3vpf   o k4hy3 -!..5s ,2 k5 j p38dtd   !i   b!fgj,nx qgif ";
        System.out.println(s.countValidWords(st));
    }
}
