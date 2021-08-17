package Acwingbasic.num5;

import java.util.Scanner;

/**
 * 01背包问题
 */
public class Dp01 {
    private static int[] f;
    //private static int[][] f;
    private static int[] V,W;
    private static int n,m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        V = new int[1010];
        W = new int[1010];
        f = new int[1010];
        //f = new int[1010][1010];
        for (int i=0; i < n; i++){
            V[i]=sc.nextInt();
            W[i]=sc.nextInt();
        }

//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j <= m; j++) {
//                f[i][j] = f[i-1][j];
//                if (j >= V[i]) f[i][j] = Math.max(f[i][j],f[i-1][j-V[i]]+W[i]) ;
//            }
//
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= V[i];j--) {
                f[j] = Math.max(f[j],f[j-V[i]] + W[i]);
            }
        }

        System.out.println(f[m]);
        //System.out.print(f[n][m]);
    }
}

