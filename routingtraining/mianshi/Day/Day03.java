package Day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day03 {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        if (len == 0) return new String[0];
        String[] res = new String[len];
        List<Integer> list = new ArrayList();
        for (int i : score) list.add(i);
        Collections.sort(list);
        for (int i = 0; i < len; i++) {
            int N = list.indexOf(score[i]);
            N = len - N - 1;
            if (N == 0) {
                res[i] = "Gold Medal";
                continue;
            }
            if (N == 1) {
                res[i] = "Silver Medal";
                continue;
            }
            if (N == 2) {
                res[i] = "Bronze Medal";
                continue;
            }
            res[i] = String.valueOf(N + 1);
        }
        return res;
    }
}
