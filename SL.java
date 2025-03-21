class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class SL {
    Node head = null; 

    
    void insertFirst(int d) 
    {
        Node n = new Node(d);
        n.next = head;
        head = n;
    }

    void insert(int d, int pos) {
        Node n = new Node(d);
        if (pos == 0) {
            insertFirst(d);
            return;
        }

        Node cur = head;
        int count = 0;
        while (cur != null && count < pos - 1) 
        {
            cur = cur.next;
            count++;
        }

        if (cur == null) {
            System.out.println("Position out of bounds");
            return;
        }

        n.next = cur.next;
        cur.next = n;
    }

    void insertLast(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = n;
        }
    }

    void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SL ll = new SL();
        ll.insertLast(10);
        ll.insertFirst(5);
        ll.insertLast(20);
        ll.insertLast(30);
        ll.insert(15, 2); // Insert 15 at position 2
        ll.display(); // Print the final list
    }
}