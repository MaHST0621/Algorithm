package Day;

import java.util.ArrayList;
import java.util.Locale;

public class Day06 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int len = licensePlate.length();
        if (len == 0) {return null;}
        ArrayList<Character> list = new ArrayList();
        String result = "";
        int min_len = Integer.MAX_VALUE;
        licensePlate = licensePlate.toLowerCase(Locale.ROOT);
        for (int i = 0; i < len;i++) {
            char ctr = licensePlate.charAt(i);
            if (ctr >= 'a' && ctr <= 'z') {
                list.add(ctr);
            }
        }
        int words_len = words.length;
        int[] count = new int[words_len];
        for (String str : words) {
            len = str.length();
            ArrayList<Character> res_list = (ArrayList<Character>) list.clone();
            for (int i = 0; i < len;i++) {
                char ctr = str.charAt(i);
                if (res_list.contains(ctr)) {
                    res_list.remove(ctr);
                }
            }
            if (res_list.size() == 0 && len < min_len) {
                result = str;
                min_len = len;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Day06 day06 = new Day06();
        String str = "1s3PSt";
        String[] strs = new String[]{"step","steps","stripe","stepple"};
        day06.shortestCompletingWord(str,strs);
    }
}
