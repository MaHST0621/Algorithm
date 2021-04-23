package algorithm.treenode;

/**
 * @Author Mahe
 * @Date 2021/4/23 15:53
 * @Version 1.0
 */

/**神级遍历树
 * 空间复杂度O(1),时间复杂度O(N)
 */
public class MasterOder {
	public void masterOder(Node head) {
		if (head==null) {return;}

		Node cur = head;
		Node mostRight = null;

		while (cur!=null) {
			mostRight = cur.left;
			if (mostRight != null) { //如果该节点有左子树
				//找到左子树上的最右节点
				while (mostRight.right != null && mostRight.right != cur) {
					mostRight = mostRight.right;
				}

				if (mostRight.right == null) {
					//如果最右节点指向null，就让其指向cur
					mostRight.right = cur;
					cur = cur.left;
					continue;
				} else { //如果最右节点指向cur，就让其断开
					mostRight.right = null;
				}
			}
			//如果没有左子树或者最右节点指向cur，cur就向右移动
			cur = cur.right;
		}
	}
}
