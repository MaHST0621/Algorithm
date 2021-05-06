package algorithm.treenode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Mahe
 * @Date 2021/5/3 15:23
 * @Version 1.0
 */
public class levelOrder {
	public void levelorder(Node head) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(head);

		while (!queue.isEmpty()) {
			Node cur = queue.poll();
			System.out.println(cur.value);
			if (cur.left!=null) {queue.offer(cur.left);}
			if (cur.right!=null) {queue.offer(cur.right);}
		}
	}
}
