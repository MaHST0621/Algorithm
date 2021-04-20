package algorithm.treenode;

/**
 * @Author Mahe
 * @Date 2021/4/20 10:14
 * @Version 1.0
 */
	//后续遍历
public class posOrder {
	public void posOrderRecur(Node head) {
		if (head == null) {
			return;
		}

		posOrderRecur(head.left);
		posOrderRecur(head.right);
		System.out.println(head.value);
	}
}
