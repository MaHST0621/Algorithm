package routinetraining.listnode;

/**
 * 反转单链表
 */
public class Day02 {
    public static Node getreverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newnode = getreverse(head.next);
        Node temp = head.next;
        temp.next = head;
        head.next = null;
        return newnode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node result = getreverse(n1);

        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }
}
