package Acwingbasic.num6;

import java.util.*;

/**
 * 八数码
 */
public class BFS2 {
    //用来保存3*3状态
    private static Map<String,Integer> map = new HashMap<>();

    public static int bfs(String start) {
        String end = "12345678x";
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        map.put(start,0);
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        while (!queue.isEmpty()) {
            String str = queue.poll();
            int distance = map.get(str);

            if (str.equals(end)) {
                return distance;
            }

            int k = str.indexOf('x');
            int x = k / 3, y = k % 3;

            for (int i = 0; i < 4; i++) {
                int x1 = x + dx[i];
                int y1 = y + dy[i];

                if ( x < 0 || x >= 3 || y < 0 || y >= 3) continue;

                String tt = makeStr(str,k,3*x1+y1);

                if (map.containsKey(tt)) continue;
                map.put(tt,distance+1);
                queue.add(tt);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String start = sc.nextLine();

        bfs(start);
    }

    static String makeStr(String t, int src, int dest){
        StringBuilder str = new StringBuilder(t);

        str.setCharAt(src, t.charAt(dest));
        str.setCharAt(dest, 'x');

        return str.toString();
    }
}
