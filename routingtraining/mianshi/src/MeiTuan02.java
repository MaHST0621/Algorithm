package src;

import java.util.*;

public class MeiTuan02 {
    private static int N = (int) (1e5 + 10);
    private static int[] dr = new int[N];
    private static HashMap<Integer,Set<Integer>> list = new HashMap<>();

    static void add(int a,int b) {
        list.get(a).add(b);
        list.get(b).add(a);
        dr[a] = list.get(a).size();
        dr[b] = list.get(b).size();
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            list.put(i,new HashSet<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a,b);
        }

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int tmp = dr[a];
            dr[a] = dr[b];
            dr[b] = tmp;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(dr[i]);
        }
    }
}
