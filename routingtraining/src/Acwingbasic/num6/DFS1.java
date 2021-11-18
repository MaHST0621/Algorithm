package Acwingbasic.num6;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 全排列
 */
public class DFS1 {
    //保存状态
    private static int[] list;
    //保存结果
    private static ArrayList<int[]> res = new ArrayList<>();
    //保存元素是否被使用
    private static boolean[] use;

    public static void dfs(int[] num,int path,int n) {
        //判断数组中的全部元素用完，完成一组新的排列
        if (n == path) {
            int[] s = Arrays.copyOf(list,n);
            res.add(s);
            return;
        }
        //保证顺序
        for (int i = 0; i < n; i++) {
            if (!use[i]) {
                list[path] = num[i];
                use[i] = true;
                dfs(num,path+1,n);
                //回溯，恢复现场
                use[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        list = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        use = new boolean[N];
        dfs(nums,0,N);
        for (int[] s : res) {
            for (int i = 0; i < 3; i++) {
                System.out.print(s[i] + "");
            }
            System.out.println();
        }
    }
}
