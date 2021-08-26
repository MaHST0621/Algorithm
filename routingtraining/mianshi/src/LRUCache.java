import java.util.HashMap;

public class LRUCache {
    class Node {
        int k,val;
        Node next,pre;
        public Node(int k,int val) {
            this.val = val;
            this.k = k;
        }
    }

    class DNodeList {
        private Node head,tail;
        private int size;

        public DNodeList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public void addFirstNode(Node n) {
            if (size == 0) {
                head=tail=n;
            }else {
                Node n1 = head;
                n1.pre = n;
                n.next = n1;
                head = n;
            }
            size++;
        }

        public void removeNode(Node n) {
            if (size == 1) {
                head = tail = null;
            } else if (n == tail) {
                tail.pre.next = null;
                tail = tail.pre;
            } else if (n == head) {
                head.next.pre = null;
                head = head.next;
            } else {
                n.pre.next = n.next;
                n.next.pre = n.pre;
            }
            size--;
        }

        public Node removeLast() {
            if (size == 1) {
                head = tail = null;
            }
            Node node = tail;
            tail.pre.next = null;
            tail = tail.pre;

            return node;
        }

        public int sieze() {
            return size;
        }
    }

    HashMap<Integer,Node> map;
    DNodeList dList;
    private int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<Integer,Node>();
        dList = new DNodeList();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        int val = map.get(key).val;
        put(key,val);
        return val;
    }

    public void put(int key, int value) {
        Node x = new Node(key,value);
        if (map.containsKey(key)) {
            dList.removeNode(map.get(key));
            dList.addFirstNode(x);
            map.put(key,x);
        } else {
            if (cap == dList.sieze()) {
                Node lastNode = dList.removeLast();
                map.remove(lastNode.k);
            }
            dList.addFirstNode(x);
            map.put(key,x);
        }
    }

}
