package algorithm.treenode;

import java.util.Stack;

/**
 * @Author Mahe
 * @Date 2021/4/20 10:11
 * @Version 1.0
 */
//中序遍历
public class inOrder {

	private Stack<Node> stack = new Stack<Node>();
	//递归
	public void inOrderRecur01(Node head) {
		if (head == null) {
			return;
		}

		//先左孩子，再根，最后后孩子
		inOrderRecur01(head.left);
		System.out.println(head.value + " ");
		inOrderRecur01(head.right);
	}

	//非递归
	public void inOrderRecur02(Node head) {
		System.out.println("in-order: ");
		if (head != null) {
			Stack<Node> stack = new Stack<Node>();
			while (!stack.isEmpty() || head != null) {
				if (head != null) {
					stack.push(head);
					head = head.left;
				} else {
					head = stack.pop();
					System.out.println(head.value + " ");
					head = head.right;
				}
			}
		}
		System.out.println();
	}
}
