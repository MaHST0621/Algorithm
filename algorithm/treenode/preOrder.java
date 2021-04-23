package algorithm.treenode;

import java.util.Stack;

/**
 * @Author Mahe
 * @Date 2021/4/20 10:09
 * @Version 1.0
 */
//先序遍历
public class preOrder {

	private Stack<Node> stack = new Stack<Node>();
	//递归
	public void preOrderRecur01(Node head) {
		if (head == null) {
			return;
		}

		System.out.println(head.value + " ");
		preOrderRecur01(head.left);
		preOrderRecur01(head.right);
	}

	//非递归
	public void preOrderRecur02(Node head) {
		if (head == null) {
			return;
		}

		stack.push(head);
		Node cur = null;
		while (!stack.isEmpty()) {
			cur = stack.pop();
			System.out.println(cur.value + " ");
			if (cur.right != null) {stack.push(cur.right);}
			if (cur.left != null) {stack.push(cur.left);}
		}
	}
}
