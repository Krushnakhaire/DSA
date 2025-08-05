public class Linkedlist_basic1 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("linkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prevNode = head;
        for (int i = 0; i < size - 2; i++) {
            prevNode = prevNode.next;
        }

        int val = prevNode.next.data;
        prevNode.next = null;
        tail = prevNode;
        size--;
        return val;
    }

    public static void main(String args[]) {
        Linkedlist_basic1 l1 = new Linkedlist_basic1();

        l1.addfirst(0);
        l1.addfirst(2);         // List: 2 -> 0 -> null
        l1.print();

        l1.add(2, 9);           // Add 9 at index 2: 2 -> 0 -> 9 -> null
        l1.add(3, 7);           // Add 7 at index 3: 2 -> 0 -> 9 -> 7 -> null
        l1.print();

        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(4);
        l1.print();             // Final list: 2 -> 0 -> 9 -> 7 -> 3 -> 4 -> 4 -> null

        System.out.println("Removed First: " + l1.removeFirst());
        System.out.println("Removed Last: " + l1.removeLast());
        l1.print();
    }
}
