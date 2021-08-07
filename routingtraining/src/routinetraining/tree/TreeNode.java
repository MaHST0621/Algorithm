package routinetraining.tree;

import java.util.Scanner;

public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode (int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public static TreeNode CreateTreeNode(Scanner sc) {
        String[] values = sc.nextLine().split(" ");
        if (values.length < 3) {
            return null;
        }
        int value = Integer.parseInt(values[0]);
        int left = Integer.parseInt(values[1]);
        int right = Integer.parseInt(values[2]);

        TreeNode root = new TreeNode(value);
        if (left != 0) {
            root.left = CreateTreeNode(sc);
        }
        if (right != 0) {
            root.right = CreateTreeNode(sc);
        }

        return root;
    }
}
