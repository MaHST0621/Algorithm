package Acwingbasic.num6;

import javafx.util.Pair;

import java.util.*;

/**
 * 走迷宫
 */
public class BFS1 {
    private static int[][] gr;
    private static int[][] dr;
    public static int bfs(int n,int m) {
        List<Pair<Integer,Integer>> que = new ArrayList<>();
        que.add(new Pair<>(0,0));
        int head = 0;
        dr[0][0] = 0;
        int[] dx = {-1,1,0,0}; int[] dy = {0,0,1,-1};

        while (head != que.size()) {
            Pair<Integer,Integer> p = que.get(head++);
            for (int i = 0; i  < 4;i ++) {
                int x = p.getKey() + dx[i];
                int y = p.getValue() + dy[i];

                if (x >= 0 && x < n && y >= 0 && y < m && gr[x][y] == 0 && dr[x][y] == -1 ) {
                    que.add(new Pair<>(x,y));
                    dr[x][y] = dr[p.getKey()][p.getValue()] + 1;
                }
            }
        }
        return dr[n-1][m-1];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        gr = new int[n][m];
        dr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                dr[i][i1] = -1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                gr[i][i1] = sc.nextInt();
            }
        }
        System.out.println(bfs(n, m));
        //bfs(n,m);
    }
}
