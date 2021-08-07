package routinetraining.listnode;

//CD48. 打印两个升序链表具有相同值的部分
/**
 * 【题目描述】：
 * 给定两个升序链表，打印两个升序链表的公共部分。（题意表述的不清楚，其实是打印出两个升序链表具有相同值的部分）
 */
/**
 * 输入描述:
 * 第一个链表的长度为 n。
 * 链表结点的值为 val。
 * 第二个链表的长度为 m。
 * 链表结点的值为 val。
 */

import java.util.Scanner;

/**
 * 【解题思路】：
 * 获取两个升序链表中具有相同值得元素，使用归并思想，从两个链表的头开始进行如下判断：
 *
 * 如果 head1 的值小于 head2，则 head1 往下移动。
 * 如果 head2 的值小于 head1，则 head2 往下移动。
 * 如果 head1 的值与 head2 的值相等，则打印这个值，然后 head1 与 head2 都往下移动。
 * head1 或 head2 有任何一个移动到 null，则整个过程停止。
 */
public class Day01 {
    public void getLevel(Node n1,Node n2) {
        while (n1 != null && n2 != null) {
            if (n1.value < n2.value) {
                n1 = n1.next;
                continue;
            }
            if (n1.value > n2.value) {
                n2 = n2.next;
                continue;
            }
            if (n1.value == n2.value) {
                System.out.print(n1.value + " ");
                n1 = n1.next;
                n2 = n2.next;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1 = scanner.nextInt();
        Node head01 = new Node(-1);
        Node p = head01;
        for (int i = 0; i < count1; i++) {
            p.next = new Node(scanner.nextInt());
            p = p.next;
        }
        int count2 = scanner.nextInt();
        Node head02 = new Node(-1);
        p = head02;
        for (int i = 0; i < count2; i++) {
            p.next = new Node(scanner.nextInt());
            p = p.next;
        }
        Day01 day01 = new Day01();
        day01.getLevel(head01.next,head02.next);
    }
}
