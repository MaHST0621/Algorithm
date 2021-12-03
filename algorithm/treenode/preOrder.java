package treenode;

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

	//空间复杂度为O(1)
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
					System.out.println(cur.value + " ");
					cur = cur.left;
					continue;
				} else { //如果最右节点指向cur，就让其断开
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
