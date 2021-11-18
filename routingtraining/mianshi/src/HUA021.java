package src;

import java.util.Arrays;
import java.util.Scanner;

public class HUA021 {
    private static int N = 100;
    private static int[] h  = new int[N];
    private static int[] el  = new int[N];
    private static int[] nex = new int[N];
    private static int[] dr = new int[N];
    private static int index;
    private static int res;

    static void add(int a,int  b) {
        el[index] = b;
        nex[index] = h[a];
        h[a] = index++;
    }
    static int dfs(int n) {
        int tt = 0;
        for (int i = h[n]; i != -1; i = nex[i]) {
            int elm = el[i];
            int res = dfs(elm);
            tt = Math.max(res,tt);
        }
        return dr[n] + tt;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Arrays.fill(h,-1);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().split(" ");
            dr[i] = Integer.parseInt(str[1]);
            int len = str.length;
            if (len < 3) continue;
            for (int j = 2; j < len; j++) {
                add(i, Integer.parseInt(str[j]));
            }
        }
        System.out.println(dfs(0));
    }
}
