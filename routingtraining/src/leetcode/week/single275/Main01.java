package leetcode.week.single275;

import java.util.HashSet;

public class Main01 {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int con = (n * (n + 1)) >> 1;
        int[] check_y = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n;i++) {
            int count = 0;
            for (int j = 0; j < n;j++) {
                set.add(matrix[i][j]);
                count += matrix[i][j];
                check_y[j] += matrix[i][j];
            }
            if (count != con || set.size() != n) {
                return false;
            }
            set.clear();
        }

        for (int i = 0; i < n;i++) {
            int count = 0;
            for (int j = 0; j < n;j++) {
                set.add(matrix[j][i]);
                count += matrix[j][i];
                check_y[j] += matrix[j][i];
            }
            if (count != con || set.size() != n) {
                return false;
            }
            set.clear();
        }


        return true;
    }

    public static void main(String[] args) {
        final Main01 main01 = new Main01();
        int[][] nums = {{2,2,2},{2,2,2},{2,2,2}};
        main01.checkValid(nums);
        System.err.println(main01.checkValid(nums));
    }
}
