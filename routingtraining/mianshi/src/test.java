package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class test {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> lisst = new LinkedList<>();
        int len = matrix.length;
        if (len == 0) return list;
        int mlx = 0;
        int mhx = len - 1;
        int mly = 0;
        int mhy = matrix[0].length - 1;
        int t = (mhx+1) * (mhy+1);

        while (t > 0) {
            for (int i = mly; i <= mhy; i++) {
                list.add(matrix[mlx][i]);
                t--;
            }
            mlx++;
            for (int i = mlx; i <= mhx;i++) {
                list.add(matrix[i][mhy]);
                t--;
            }
            mhy--;
            for (int i = mhy; i >= mly;i--) {
                list.add(matrix[mhx][i]);
                t--;
            }
            mhx--;
            for (int i = mhx; i >= mlx; i--) {
                list.add(matrix[i][mly]);
                t--;
            }
            mly++;
        }
        return list;
    }

    public static void main(String[] args) {
        test test = new test();
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        test.spiralOrder(nums);
        //System.out.println(test.spiralOrder(nums));
    }
}