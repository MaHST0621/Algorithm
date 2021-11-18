package Acwingbasic.num6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的锯齿形层序遍历
 */
public class BFS5 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        queue.add(root);
        boolean left = true;

        while (!queue.isEmpty()) {
            int count = queue.size();
            TreeNode[] nodes = new TreeNode[count];
            for (int i = 0; i < count; i++) {
                nodes[i] = queue.peek();
                TreeNode node = queue.remove();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (left) {
                for (int i = nodes.length-1; i >=0;i--) path.add(nodes[i].val);
            } else {
                for (int i = 0; i < nodes.length; i++) path.add(nodes[i].val);
            }
            list.add(new ArrayList<>(path));
            path.clear();
        }
        return list;
    }


}


