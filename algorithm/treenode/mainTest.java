package algorithm.treenode;

/**
 * @Author Mahe
 * @Date 2021/4/20 10:18
 * @Version 1.0
 */
public class mainTest {

	public static void main(String[] args) {
		inOrder inOrder = new inOrder();
		posOrder posOrder = new posOrder();
		preOrder preOrder = new preOrder();

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
//		Node n8 = new Node(8);

		n1.setKid(n2,n3);
		n2.setKid(n4,n5);
		n3.setKid(n6,n7);

		posOrder.posOrderRecur(n1);

	}
}
