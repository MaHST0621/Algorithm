package leetcode.week.single276;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main02 {
    public int minMoves(int target, int maxDoubles) {
        int ans = 0;
        Queue<Integer> queue = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        queue.add(1);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ans++;
            for (int i = 0; i < size; i++) {
                int num = queue.poll();
                if (num != target) {
                    int nu_add = num + 1;
                    if (nu_add <= target) {
                        queue.add(nu_add);
                    }
                    if (map.containsKey(nu_add) && map.get(nu_add) > 0) {
                        map.remove(nu_add);
                    }
                    if (num * 2 <= target && maxDoubles > 0) {
                        int mul = num * 2;
                        if (map.containsKey(num)) {
                            int maxD = map.get(num);
                            if (maxD > 0) {
                                queue.add(mul);
                                map.put(mul, map.get(num) - 1);
                                map.remove(num);
                            }
                        }else {
                            map.put(mul,maxDoubles - 1);
                            queue.add(mul);
                        }
                    }
                }else {
                    return ans - 1;
                }
            }
        }
        return -1;
    }

    public static void main (String[]args){
        Main02 m = new Main02();
        m.minMoves(19, 2);

    }
}
