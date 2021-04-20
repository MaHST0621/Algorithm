package algorithm.treenode;

/**
 * @Author Mahe
 * @Date 2021/4/20 10:11
 * @Version 1.0
 */
//中序遍历
public class inOrder {

	public void inOrderRecur(Node head) {
		if (head == null) {
			return;
		}

		//先左孩子，再根，最后后孩子
		inOrderRecur(head.left);
		System.out.println(head.value + " ");
		inOrderRecur(head.right);
	}
}
