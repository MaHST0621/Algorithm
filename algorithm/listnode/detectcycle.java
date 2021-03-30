package algorithm.listnode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mahe
 * @Date 2021/3/25 18:40
 * @Version 1.0
 */
public class detectcycle {

    static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node detectCycle(Node node) {
        if (! isCycle(node)) {
            return null;
        }

        Map<Node,Integer> node_count = new HashMap<Node,Integer>();
        node_count.put(node,1);
        while (node_count.get(node) <= 1) {
            node_count.put(node,node_count.get(node)+1);
            node = node.next;
        }

        return node.next;

    }

    public boolean isCycle(Node node) {
        Node fast = node;
        Node low = node;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            low = low.next;

            if (fast == low) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        detectcycle detectcycle = new detectcycle();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(2);
        Node node5 = new Node(1);
        //Node node6 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;

        detectcycle.detectCycle(node1);
    }
}
