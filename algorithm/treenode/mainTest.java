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
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		Node n10 = new Node(10);
		Node n11 = new Node(11);
		Node n12 = new Node(12);
		Node n13 = new Node(13);
		Node n14 = new Node(14);
		Node n15 = new Node(15);


		n1.setKid(n2,n3);
		n2.setKid(n4,n5);
		n3.setKid(n6,n7);
		n4.setKid(n8,n9);
		n5.setKid(n10,n11);
		n6.setKid(n12,n13);
		n7.setKid(n14,n15);

		posOrder.posOrderRecur02(n1);

	}
}
