package routinetraining.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数 n ，请你生成并返回所有由 n 个节点组成且节点值从 1 到 n 互不相同的不同 二叉搜索树 。可以按 任意顺序 返回答案。
 * //todo
 *
 */
public class Day01 {
    boolean[] use;
    int flag = 0;
    public List<TreeNode> generateTrees(int n) {
        if (n < 1) return new ArrayList<>();
        TreeNode[] tq = new TreeNode[n + 1];
        TreeNode head = null;
        use = new boolean[n + 1];
        List<TreeNode> res = new ArrayList<>();
        for (int i = 1; i <= n;i++) {
            tq[i] = new TreeNode(i);
        }
        System.out.println();
    }

    private void dfs(TreeNode[] tq , int n ,TreeNode head) {
        if(flag == n) {

        }
        for (int i = 1; i <= n; i++) {
            if (flag == 1) {
                head = tq[i];
                continue;
            }

        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        }
    }
}
