package Acwingbasic.num6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 建树 + 树的重心
 */
public class DFS3 {
    private static final int n = (int) (1e5 + 10);
    //
    private static int[] h = new int[n];
    //
    private static int[] el = new int[n << 1];
    //
    private static int[] nex = new int[n << 1];
    //
    private static int index = 0;
    //
    private static boolean[] use;

    private static int result = Integer.MAX_VALUE;
    public static void add(int a,int b) {
        el[index] = b;
        nex[index] = h[a];
        h[a] = index++;
    }

    public static int dfs(int u,int N) {
        use[u] = true;
        int sum = 1;
        int res = 0;

        for (int i = h[u]; i != -1; i = nex[i]) {
            int id = el[i];
            if (use[id] == false) {
                int s = dfs(id,N);
                sum += s;
                res = Math.max(res,s);
            }
        }
        res = Math.max(res,N-sum);
        result = Math.min(result,res);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        use = new boolean[N+1];
        Arrays.fill(h,-1);

        for (int i = 1; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            add(a,b);
            add(b,a);
        }
        dfs(1,N);
        System.out.println(result);
    }
}
