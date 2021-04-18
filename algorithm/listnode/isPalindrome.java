package algorithm.listnode;

import java.util.Stack;

/**
 * @Author Mahe
 * @Date 2021/3/25 14:19
 * @Version 1.0
 */

/**判断链表是否为回文结构
 *
 */
public class isPalindrome {

    static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    //时间复杂度O（n） 空间O（N）
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


    public boolean isPalindrome3(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Stack<Node> stack = new Stack<Node>();
        Node right = head;
        Node left = head;

        while (right.next != null && right.next.next != null) {
            right = right.next.next;
            left = left.next;
        }

        right = left.next;

        while (right != null) {
            stack.push(right);
            right = right.next;
        }

        while (!stack.isEmpty()) {
            if (head.value != stack.pop().value) {
                return false;
            }
            head = head.next;
        }

        return true;

    }

    //空间复杂度为O（1）
    //用三个指针找到链表中间节点，并把右半区反转
    //然后再通过遍历判断是否为回文
    public boolean isPalindrome2(Node head){

        if (head == null || head.next == null) {
            return true;
        }

        Node node1 = head;
        Node node2 = head;
        Node node3 = null;

        //当快指针溢出时慢指针刚好处于链表中间
        while (node2.next != null && node2.next.next != null) {
            node1 = node1.next;
            node2 = node2.next.next;
        }

        node2 = node1.next; //node2 为右半区第一个节点
        node1.next = null; //中间节点指向空

        while (node2 != null) {
            node3 = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = node3;
        }

        node3 = node1; // node3保存最后一个节点
        node2 = head;
        boolean res = true;
        while (node1 != null && node2 != null) {
            if (node1.value != node2.value) {
                res = false; //无论怎么样都要恢复链表
                break;
            }
            node1 = node1.next;
            node2 = node2.next;
        }

        node1 = node3.next;
        node3.next = null;

        while (node1 != null) {
            node2 = node1.next;
            node1.next = node3;
            node3 = node1;
            node1 = node2;
        }

        return res;
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
