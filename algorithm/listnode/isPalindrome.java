package algorithm.listnode;

import java.util.Stack;

/**
 * @Author Mahe
 * @Date 2021/3/25 14:19
 * @Version 1.0
 */
public class isPalindrome {

    static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public boolean isPalindrome1(Node head) {

        Stack<Node> stack = new Stack<Node>();
        Node cur = head;
        while(cur != null) {
            stack.push(cur);
            cur = cur.next;
        }

        while(head != null) {

            if (head.value != stack.pop().value) {
                return false;
            }
            head = head.next;
        }
        return true;
    }


    public boolean isPalindrome2(Node head){

        if (head == null || head.next == null) {
            return true;
        }

        Node node1 = head;
        Node node2 = head;
        Node node3 = null;

        while (node2.next != null && node2.next.next != null) {
            node1 = node1.next;
            node2 = node2.next.next;
        }

        node2 = node1.next;
        node1.next = null;

        while (node2 != null) {
            node3 = node2.next;
            node2.next = node1;
            node1 =node2;
            node2 = node3;
        }

        node3 = node1;
        node2 = head;

        while (node1 != null && node2 != null) {
            if (node1.value == node2.value) {
                node1 = node1.next;
                node2 = node2.next;
            }else return false;
        }
        return true;
    }






    public static void main(String[] args) {
        isPalindrome ispalindrome = new isPalindrome();
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
        node5.next = null;
        //node6.next = null;

        System.out.println(ispalindrome.isPalindrome2(node1));

    }

}
