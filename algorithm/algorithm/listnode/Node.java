package algorithm.listnode;

/**
 * @Author Mahe
 * @Date 2021/4/18 14:00
 * @Version 1.0
 */
public class Node {
	int value;
	Node next;

	public Node(int value) {
		this.value = value;
	}
	public Node(int value , Node node) {this.value = value;this.next = node;}
}
