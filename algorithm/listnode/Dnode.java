package algorithm.listnode;

/**
 * @Author Mahe
 * @Date 2021/4/18 14:28
 * @Version 1.0
 */
//双向链表
public class Dnode {
	public int value;
	public Dnode last;
	public Dnode next;

	public Dnode(int data) {
		value = data;
	}

	public Dnode(int data,Dnode next) {
		value = data;
		this.next = next;
	}

	public void preNode(Dnode pre) {
		this.last = pre;
	}
}
