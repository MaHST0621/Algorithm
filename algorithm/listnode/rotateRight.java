package algorithm.listnode;

/**
 * @Author Mahe
 * @Date 2021/4/23 18:52
 * @Version 1.0
 */

/**
 * 向右移动链表各个节点
 */
public class rotateRight {

	public Node ro(Node head, int k) {
		if (head ==null || k < 1) {
			return head;
		}

		Node fast = head;
		while(fast.next != null) {
			fast=fast.next;
		}
		fast.next = head;
		fast = head;
		while (k-- > 0) {
			fast = fast.next;
		}
		head = fast.next;
		fast.next = null;
		return head;
	}
}
