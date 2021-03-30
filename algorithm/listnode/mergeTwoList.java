package algorithm.listnode;

/**
 * @Author Mahe
 * @Date 2021/3/25 17:59
 * @Version 1.0
 */
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

        Node head = (l1.value <= l2.value)? l1:l2;
        Node n1 = (head == l1)? l1:l2;
        Node n2 = (head == l1)? l2:l1;
        Node pre = null;
        Node next = null;

        while (n1 != null && n2 != null) {
            if (n1.value <= n2.value) {
                pre = n1;
                n1 = n1.next;
            } else {
                next = n2.next;
                pre.next = n2;
                n2.next = n1;
                pre = n2;
                n2 = next;
            }
        }

        pre.next = n1 == null ? n2:n1;
        return head;

    }

    public static void main(String[] args) {
        mergeTwoList mergetwolist = new mergeTwoList();

        Node node1 = new Node(1);
        Node node2 = new Node(4);
        Node node3 = new Node(6);
        Node node4 = new Node(2);
        Node node5 = new Node(3);
        //Node node6 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        node5.next = null;

        Node result = mergetwolist.mergetwolist1(node1,node4);
        while(result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }
}
