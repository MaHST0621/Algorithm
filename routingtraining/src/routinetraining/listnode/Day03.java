package routinetraining.listnode;

import java.util.Stack;

/**
 * K个节点逆转
 */
public class Day03 {
    public Node reverseKGroup(Node head, int k) {
        if (k < 2) return head;
        Node newhead = head;
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        Node pre = null;
        Node next = null;
        while (cur != null) {
            next = cur.next; //right : 未处理分组的第一个节点
            stack.push(cur);

            if (stack.size() == k) {
                pre = resign(stack,pre,next); //left ： 保存最近处理分组的最后一个节点
                newhead = newhead == head ? cur : newhead;
            }

            cur = next;
        }
        return newhead;
    }

    public Node resign(Stack<Node> stack,Node left,Node right) {
        Node cur = stack.pop();
        if (left != null) {
            left.next = cur;
        }

        while (!stack.isEmpty()) {
            Node next = stack.pop();
            cur.next = next;
            cur = next;
        }

        cur.next = right;
        return cur;
    }

    public Node reverseKGroup02(Node head, int k) {
        if (k < 2) return head;
        Node newhead = head;
        Node cur = head;
        Node start = head;
        Node pre = null;
        Node next = null;
        int count = 1;
        while (cur != null) {
            next = cur.next; //right : 未处理分组的第一个节点

            if (count == k) {
                start = pre == null ? head : pre.next;
                head = pre == null ? cur : head;
                resign02(start,pre,next,cur);
                pre = start; //left ： 保存最近处理分组的最后一个节点 . 因为start是处理前的head节点，因此处理后是end节点
                count = 0;
            }

            count++;
            cur = next;
        }
        return newhead;
    }

    public void resign02(Node start,Node left,Node right,Node end) {
        Node cur = start.next;
        Node pre = start;
        Node next = null;

        while (cur != right) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        if (left != null) {
            left.next = end;
        }
        start.next = right;
    }

    public static void main(String[] args) {
        Day03 day03 = new Day03();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        day03.reverseKGroup(node1,2);

    }
}
