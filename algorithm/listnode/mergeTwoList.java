package algorithm.listnode;

/**
 * @Author Mahe
 * @Date 2021/3/25 17:59
 * @Version 1.0
 */
//合并两个有序的链表
public class mergeTwoList {
    static class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public Node mergetwolist1(Node l1, Node l2) {
        if (l1 == null || l2 == null) {
            return (l1 == null)? l1:l2;
        }

        Node head = null;
        head = (l1.value < l2.value) ? l1:l2; //使链表开头值小的链表作为合并后的链表保存在head
        Node cur1 = head == l1 ? l1 : l2; //默认cur1能作为head开头的链表
        Node cur2 = head == l1 ? l2 : l1;
        Node pre = null; //用来保存上一次最小值的节点
        Node next = null; // 插入时的中间节点

        while (cur1 != null && cur2 != null) {
            if (cur1.value < cur2.value) { //如果cur1小于cur2的值则不变，cur1继续向下遍历
                pre = cur1;
                cur1 = cur1.next;
            } else { //如果cur1大于cur2，则cur2插入到pre.next cur2.next指向cur1 并把cur2 保存在pre中
                next = cur2.next;
                pre.next = cur2;
                cur2.next = cur1;
                pre = cur2;
                cur2 = next;
            }
        }

        pre.next = cur1 == null ? cur2 : cur1;
        return head;

    }

    public static void main(String[] args) {
        mergeTwoList mergetwolist = new mergeTwoList();

        Node node1 = new Node(1);
        Node node2 = new Node(4);
        Node node3 = new Node(6);
        Node node4 = new Node(2);
        Node node5 = new Node(3);
        //algorithm.listnode.Node node6 = new algorithm.listnode.Node(5);

        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        node5.next = null;

        Node result =  mergetwolist.mergetwolist1(node1,node4);

        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }
}
