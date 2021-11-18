package Acwingbasic.num6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 图的层次
 */
public class BFS3 {
    private static int N = (int) (1e5 + 10);
    //
    private static int[] h = new int[N];
    //
    private static int[] el = new int[N << 1];
    //
    private static int[] nex = new int[N << 1];

    private static int indx;
    //
    private static int[] dr = new int[N];

    private static boolean[] use;
    static void add(int a, int b) {
        el[indx] = b;
        nex[indx] = h[a];
        h[a] = indx++;
    }

    static int bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        dr[1] = 0;
        queue.add(1);

        while (!queue.isEmpty()) {
            int qq = queue.remove();
            use[qq] = true;

            for (int i = h[qq]; i != -1; i = nex[i]) {
                int elm = el[i];
                if (!use[elm]) {
                    dr[elm] = dr[qq] + 1;
                    queue.add(elm);
                }
            }
        }
        return dr[n];
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        use = new boolean[n+1];
        Arrays.fill(dr,-1);
        Arrays.fill(h,-1);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a,b);
            add(b,a);
        }

        bfs(n);
    }
}
