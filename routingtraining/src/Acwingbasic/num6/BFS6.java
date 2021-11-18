package Acwingbasic.num6;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 岛屿数量
 */
public class BFS6 {
    public int numIslands(char[][] grid) {
        int len = grid.length;
        if (len == 0) return 0;
        int col = grid[0].length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    bfs(i,j,len,col,grid);
                    result++;
                }
            }
        }
        return result;
    }

    public void bfs(int x,int y,int X,int Y,char[][] grid) {
        Queue<PII> queue = new LinkedList<>();
        queue.add(new PII(x,y));
        int[] dx = {-1,1,0,0},dy = {0,0,1,-1};
        while (!queue.isEmpty()) {
            PII p = queue.remove();
            int px = p.first, py = p.second;
            for (int i = 0; i < 4; i++) {
                int xx = px + dx[i];
                int yy = py + dy[i];

                if (xx >= 0 && xx < X && yy >= 0 && yy < Y && grid[xx][yy] == '1') {
                    queue.add(new PII(xx,yy));
                    grid[xx][yy] = '0';
                }
            }
        }
    }

    class PII {
        private int first;
        private int second;

        public PII(int first,int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        BFS6 bfs6 = new BFS6();
        char[][] cc = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        bfs6.numIslands(cc);
    }
}
