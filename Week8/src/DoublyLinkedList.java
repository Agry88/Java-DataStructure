public class DoublyLinkedList {
    class Node {
        int val;
        Node pre;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;

    public DoublyLinkedList() {
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.pre = head;
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        node.next = tail;
        node.pre = tail.pre;
        tail.pre.next = node;
        tail.pre = node;
    }

    public void removeFirst() {
        if (head.next == tail) {
            return;
        }
        head.next = head.next.next;
        head.next.pre = head;
    }

    public void removeLast() {
        if (tail.pre == head) {
            return;
        }
        tail.pre = tail.pre.pre;
        tail.pre.next = tail;
    }

    public void print() {
        Node cur = head.next;
        while (cur != tail) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.removeFirst();
        list.removeLast();
        list.print();
    }

}