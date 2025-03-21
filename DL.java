class Node {
    int data;
    Node prev, next;

    Node(int d) {
        data = d;
        prev = next = null;
    }
}

public class DL {
    Node head;

    void insertFirst(int d) {
        Node n = new Node(d);
        if (head != null) {
            n.next = head;
            head.prev = n;
        }
        head = n;
    }

    void insert(int d, int pos) {
        if (pos == 0) {
            insertFirst(d);
            return;
        }

        Node n = new Node(d);
        Node cur = head;
        int count = 0;

        while (cur != null && count < pos - 1) {
            cur = cur.next;
            count++;
        }

        if (cur == null) {
            System.out.println("Position out of bounds");
            return;
        }

        n.next = cur.next;
        n.prev = cur;

        if (cur.next != null) {
            cur.next.prev = n;
        }

        cur.next = n;
    }

    void insertLast(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
            return;
        }

        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = n;
        n.prev = cur;
    }

    void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " <-> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DL dll = new DL();
        dll.insertLast(10);
        dll.insertFirst(5);
        dll.insertLast(20);
        dll.insertLast(30);
        dll.insert(15, 2);
        dll.display();
    }
}