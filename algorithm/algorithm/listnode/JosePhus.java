package algorithm.listnode;

/**
 * @Author Mahe
 * @Date 2021/4/18 15:18
 * @Version 1.0
 */

/**约瑟夫问题（单链表）
 *
 */
public class JosePhus {

	public Node josephusKill01(Node head,int k) {
		if (head == null || k < 1 || head.next == head) {
			return head;
		}
		Node pre = head;
		while (pre.next != head) {
			pre = pre.next;
		}
		int n = 0;
		while (pre != head) {
			n++;
			if (n == k) {
				n = 0;
				pre.next = head.next;
			} else {
				pre = pre.next;
			}
			head = pre.next;
		}
		return head;

	}

	public static void main(String[] args) {

		Node n4 = new Node(4,null);
		Node n3 = new Node(3,n4);
		Node n2 = new Node(2,n3);
		Node n1 = new Node(1,n2);

		n4.next = n1;

		JosePhus josePhus = new JosePhus();

		Node result = josePhus.josephusKill01(n1,1);
		System.out.println(result.value);
	}
}
