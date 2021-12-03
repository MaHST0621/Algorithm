package treenode;

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

	//
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
					System.out.println(cur.value + " ");
					mostRight.right = null;
				}
			}else {
				System.out.println(cur.value + " ");
			}
			//如果没有左子树或者最右节点指向cur，cur就向右移动
			cur = cur.right;
		}
	}
}
