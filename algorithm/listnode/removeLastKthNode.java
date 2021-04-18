package algorithm.listnode;

/**
 * @Author Mahe
 * @Date 2021/4/18 14:00
 * @Version 1.0
 */

/**删除链表的倒数K项节点
 * 通过一个递减的整数来判断
 */
public class removeLastKthNode {

	//单项链表
	public Node reMoveLastKthNode(Node head,int k) {
		if (head == null || k < 1) {
			return head;
		}

		Node n1 = head;

		while (n1 != null) { //通过k来确定需要删除节点的位置
			n1 = n1.next;
			k--;
		}

		//如果k>0的话 意思就是k的长度是大于链表的长度，因此不用做修改 直接返回即可
		//但也可以不用加这一句 最后也会返回不变的head
		if (k > 0) {return head;}
		//如果k==0的话意思就是k的长度和链表的长度是一致的，也就是说头节点就是第倒数k节点，返回head.next即可
		if (k == 0) {return head.next;}
		//k<0的意思就是K在链表的长度范围内
		//如果需要删除一个节点我们就需要找到倒数k+1节点的位置
		if (k < 0) {
			n1 = head;
			while (++k != 0) { //k = 0时节点的位置就在倒数k+1节点位置
				n1 = n1.next;
			}
			n1.next = n1.next.next; // 倒数k+1节点跳过倒数k节点 直接指向k-1节点
		}
		return head;
	}

	//双向链表
	//与单向链表是一样的，只要记得把last接上
	public Dnode reMoveLastKthNode01(Dnode head,int k) {
		if (head == null || k < 1) {
			return head;
		}
		 Dnode cur = head;

		while (cur != null) {
			k--;
			cur = cur.next;
		}
		if (k == 0) {
			head = head.next;
			head.last = null;
			return head;
		}
		if (k < 0) {
			cur = head;
			while (++k != 0 ) {
				cur = cur.next;
			}
			//这儿需要主义的是 如果cur.next.next为空时 很容易在if语句里报错
			Dnode ne = cur.next.next;
			cur.next = ne;
			if (ne != null) {
				ne.last = cur;
			}
		}

		return head;
	}

	public static void main(String[] args) {
		Node n4 = new Node(4,null);
		Node n3 = new Node(3,n4);
		Node n2 = new Node(2,n3);
		Node n1 = new Node(1,n2);

		Dnode nn4 = new Dnode(4,null);
		Dnode nn3 = new Dnode(3,nn4);
		Dnode nn2 = new Dnode(2,nn3);
		Dnode nn1 = new Dnode(1,nn2);

		nn1.preNode(null);
		nn2.preNode(nn1);
		nn3.preNode(nn2);
		nn4.preNode(nn3);

		removeLastKthNode removeLastKthNode = new removeLastKthNode();

//		Node result = removeLastKthNode.reMoveLastKthNode(n1,5);
//
//		while (result != null) {
//			System.out.println(result.value);
//			result = result.next;
//		}


		Dnode resul = removeLastKthNode.reMoveLastKthNode01(nn1,1);

		while (resul != null) {
			System.out.println(resul.value);
			resul = resul.next;
		}

	}
}
