public class MergeTwoList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = l1.val < l2.val ? l1 : l2;
        ListNode ano = head == l1 ? l2 : l1;
        ListNode cur = head;

        while (cur.next != null && ano != null) {
            if (cur.next.val > ano.val) {
                ListNode tmp = ano;
                ano = ano.next;
                tmp.next = cur.next;
                cur.next = tmp;
                cur = tmp;
            }else {
                cur = cur.next;
            }
        }

        while (ano != null) {
            cur.next  = ano;
            cur = ano;
            ano = ano.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(-9);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = null;
        node3.next = node4;
        node4.next = null;

        mergeTwoLists(node1,node3);
    }
}
