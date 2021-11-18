package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HUA02 {
    private static int[][] gr;
    private static int[][] dr;
    private static int distase = 0;
    public static int bfs(int M,int N) {
        Queue<PII> queue = new LinkedList<>();
        queue.add(new PII(0,0));
        dr[0][0] = 0;
        //向量偏移量
        int[] dx = {0,1},dy = {1,0};
        while (!queue.isEmpty()) {
            distase++;
            int count = queue.size();
            int px = 0,py = 0;
            for (int i = 0; i < count; i++) {
                PII p = queue.remove();
                int path = gr[p.first][p.second];
                //向右拓展
                for (int j = 1; j <= path; j++) {
                    px = Math.min(p.first + dx[0]*j,M-1);
                    py = Math.min(p.second + dy[0]*j,N-1);
                    if (gr[px][py] == 0) break;
                    if (dr[px][py] == -1) {
                        queue.add(new PII(px,py));
                        dr[px][py] = distase;
                    }
                }
                //向下拓展
                for (int j = 1; j <= path; j++) {
                    px = Math.min(p.first + dx[1]*j,M-1);
                    py = Math.min(p.second + dy[1]*j,N-1);
                    if (gr[px][py] == 0) break;
                    if (dr[px][py] == -1) {
                        queue.add(new PII(px,py));
                        dr[px][py] = distase;
                    }
                }
            }
        }
        return dr[M-1][N-1];
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String[] line = sc.nextLine().split(",");
        int M = Integer.parseInt(line[0]);
        int N = Integer.parseInt(line[1]);
        gr = new int[M][N];
        dr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                gr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                dr[i][j] = -1;
            }
        }
        System.out.println(bfs(M, N));
    }

    static class PII {
        private Integer first;
        private Integer second;

        public PII(int first,int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }
}
