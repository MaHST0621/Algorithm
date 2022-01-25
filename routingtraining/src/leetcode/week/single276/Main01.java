package leetcode.week.single276;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

    public String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
        int len = s.length();
        for (int i = 0;i < len;) {
            int kk = k;
            StringBuilder stringBuilder = new StringBuilder();
            while (kk-- > 0) {
                if (i < len) {
                    stringBuilder.append(s.charAt(i));
                }else {
                    stringBuilder.append(fill);
                }
                i++;
            }
            list.add(stringBuilder.toString());
        }
        String[] ans = new String[list.size()];
        for (int i = 0; i < list.size();i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
