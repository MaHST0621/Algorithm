package leetcode.week.single275;

import java.util.ArrayList;
import java.util.List;

public class Main03 {
    public int wordCount(String[] startWords, String[] targetWords) {
        int ans = 0;
        int len_start = startWords.length;
        int len_target = targetWords.length;
        for (int i = 0; i < len_target;i++) {
            String s1 = targetWords[i];
            for (int j = 0; j < len_start; j++) {
                if (check(s1,startWords[j])) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }

    //s1是否能被说转换而来
    //s2要满足： 1.重排：长度相等并且出现的字符串也一样 2.追加： 长度等于 s1.length() - 1 并且 出现的字符串有重复
    public boolean check(String s1,String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 < len2 || len1 - len2 > 1) {return false;}
        if (s1.equals(s2)) {return false;}
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < len1;i++) {
            list.add(s1.charAt(i));
        }
        for (int i = 0; i < len2;i++) {
            char chr = s2.charAt(i);
            if (list.contains(chr)) {
                list.remove(new Character(chr));
            }else {
                return false;
            }
        }

        return list.size() <= 1;
    }

    public static void main(String[] args) {
        String[] start = {"ant","act","tack"};
        String[] target = {"tack","act","acti"};

        Main03 main03 = new Main03();
        main03.wordCount(start,target);
    }
}
