package atcoder.at4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author：异想天开的咸鱼
 * @date: 2022/1/30
 */
public class Main04 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    static List<Integer> ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        TreeNode root = new TreeNode(0);
        TreeNode cur = root;
        ans = new ArrayList<>();
        for (int i = 0;i < str.length();i++) {
            char ch = str.charAt(i);
            TreeNode node = new TreeNode(i + 1);
            if (ch == 'L') {
                cur.left = node;
            }else {
                cur.right = node;
            }
            cur = node;
        }
        dfs(root);
        for (int i = 0;i < ans.size();i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static void dfs(TreeNode root) {
        if (root == null) {return;}
        dfs(root.left);
        ans.add(root.val);
        dfs(root.right);
    }
}
