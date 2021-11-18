package Acwingbasic.num6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * N皇后问题
 * 两个皇后不在同一行，同一列，同一对角线
 */
public class DFS2 {
    private static char[][] gr;
    private static List<List<String>> res = new ArrayList<>();
    private static boolean[] clo,dg,udg;

    private static void dfs(char[][] gr,int dep,int n) {
        if (dep == n) {
            for (int i = 0; i < n; i++) {
                for (int i1 = 0; i1 < n; i1++) {
                    System.out.print(gr[i][i1]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!clo[i] && !dg[i + dep] && !udg[n - dep + i]) {
                gr[dep][i] = 'Q';
                clo[i] = dg[i + dep] = udg[i - dep + n] =true;
                dfs(gr,dep + 1,n);
                clo[i] = dg[i + dep] = udg[i - dep + n] =false;
                gr[dep][i] = '.';
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println();
        gr = new char[N][N];
        clo = new boolean[N];
        dg = new boolean[20];
        udg = new boolean[20];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                gr[i][j] = '.';
            }
        }
        dfs(gr,0,N);
    }
}
