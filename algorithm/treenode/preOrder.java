package algorithm.treenode;

/**
 * @Author Mahe
 * @Date 2021/4/20 10:09
 * @Version 1.0
 */
//先序遍历
public class preOrder {

	public void preOrderRecur(Node head) {
		if (head == null) {
			return;
		}

		System.out.println(head.value + " ");
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}
}
