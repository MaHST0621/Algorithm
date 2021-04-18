package algorithm.listnode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mahe
 * @Date 2021/3/25 18:40
 * @Version 1.0
 */

/**查找环的入口节点
 * 1.通过快慢指针来找出相遇点，如果相遇点为空 则返回null；
 * 2.通过画图可知和方程可知相遇点到入口节点的距离和头部节点到入口节点的距离是相等的
 */
public class detectcycle {

    static class ListNode{
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) {return null;}

        ListNode fast = head;
        ListNode low = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;

            if (low == fast) {break;}
        }
        if (low == null) return null;
        fast = head;

        while (low != fast) {
            fast = fast.next;
            low = low.next;
        }
        return low;
    }

    public static void main(String[] args) {
        detectcycle detectcycle = new detectcycle();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        //algorithm.listnode.Node node6 = new algorithm.listnode.Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;

        System.out.println(detectcycle.detectCycle(node1).value);
    }
}
