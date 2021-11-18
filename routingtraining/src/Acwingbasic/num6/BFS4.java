package Acwingbasic.num6;

import java.util.*;

/**
 * 拓扑排序
 */

/**
 * 有向无环图 有拓扑属性
 */
public class BFS4 {
    private static int N = (int) (1e5 + 10);
    private static int[] h = new int[N];
    private static int[] el = new int[N];
    private static int[] nex = new int[N];
    private static int index;
    private static int[] in = new int[N];
    private static List<Integer> list = new ArrayList<>();

    static void add(int a,int b) {
        el[index] = b;
        in[b] += 1;
        nex[index] = h[a];
        h[a] = index++;
    }
    static boolean bfs(int n) {
        Queue<Integer> queue = new LinkedList();
        //先将入度为0的点入队列
        for (int i = 1; i <= n; i++) {
            if (in[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int qq = queue.remove();
            list.add(qq);
            for(int i = h[qq]; i != -1; i = nex[i]) {
                int elm = el[i];
                // 删除 qq -> tt 这条边
                //等同于 tt 这个点的入度 -1
                in[elm]--;
                if (in[elm] == 0) queue.add(elm);
            }
        }
        return list.size() == n;
    }

    public static void main(String[] args) {
        Scanner sc =     new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Arrays.fill(h,-1);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a,b);
        }

        if (bfs(n)) {
            for (int k : list) {
                System.out.print(k + " ");
            }
        }
        System.out.println(-1);
    }
}
