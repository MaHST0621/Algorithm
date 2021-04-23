package algorithm.treenode;

import java.util.Stack;

/**
 * @Author Mahe
 * @Date 2021/4/20 10:14
 * @Version 1.0
 */
	//后续遍历
public class posOrder {
	public void posOrderRecur01(Node head) {
		if (head == null) {
			return;
		}

		posOrderRecur01(head.left);
		posOrderRecur01(head.right);
		System.out.println(head.value);
	}

	public void posOrderRecur02(Node head) {
		if (head == null) {
			return;
		}
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		Node cur = null;
		s1.push(head);
		while (!s1.isEmpty()) {
			cur = s1.pop();
			s2.push(cur);
			if (cur.left != null) s1.push(cur.left);
			if (cur.right != null) s1.push(cur.right);
		}

		while (!s2.isEmpty()) {
			System.out.println(s2.pop().value);
		}
	}
}
