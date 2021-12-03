package algorithm.listnode;
/**
 * @Author Mahe
 * @Date 2021/4/23 18:53
 * @Version 1.0
 */
public class mainTest {
	public static void main(String[] args) {

		Node n5 = new Node(5,null);
		Node n4 = new Node(4,n5);
		Node n3 = new Node(3,n4);
		Node n2 = new Node(2,null);
		Node n1 = new Node(1,n2);

		rotateRight ro = new rotateRight();
		Node head = ro.ro(n1,3);

		while (head != null) {
			System.out.println(head.value + " ");
			head = head.next;
		}
	}
}
