package algorithm;

import java.util.*;

public class TTEst {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    static class Solution {
        public static Node copyRandomList(Node head) {
            HashMap<Node,Node> map = new HashMap();
            Node cur = head;
            Node n = null;
            Node nn = new Node(100);
            while (cur != null) {
                n = new Node(cur.val);
                nn.next = n;
                nn = n;
                map.put(cur,n);
                cur = cur.next;
            }

            cur = head;
            Node n1 = null;
            Node n2 =  null;
            while (cur != null) {
                n2 = map.get(cur.random);
                n1 = map.get(cur);
                n1.random = n2;
                cur = cur.next;
            }
            return map.get(head);
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        Solution.copyRandomList(n1);

    }
}
