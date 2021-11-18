package Acwingbasic.num6;

/**
 * 最近公共父节点
 */
public class DFS4 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right= lowestCommonAncestor(root.right,p,q);

        if (left == null) return right;
        if (right == null) return left;

        return root;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(16);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(6);

        node1.left = node2;
        node1.right = node2;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        DFS4 dfs4 = new DFS4();

        System.out.println(dfs4.lowestCommonAncestor(node1, node2, node7).val);
    }
}
