package treenode;

/**
 * @Author Mahe
 * @Date 2021/4/20 10:08
 * @Version 1.0
 */
public class Node {
	public int value;
	public Node left;
	public Node right;

	public Node(int data) {
		this.value = data;
	}

	public void setKid(Node left, Node right) {
		this.left = left;
		this.right = right;
	}
}
