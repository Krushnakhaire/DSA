public class SimpleLL {
    public class LinkedListBasic {

    // Node class represents each element of the linked list
    static class Node {
        int data;      // data part
        Node next;     // pointer to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // head of the linked list

    // Insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {  // if list is empty
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {  // traverse to the last node
            temp = temp.next;
        }

        temp.next = newNode; // link new node at the end
    }

    // Delete the first occurrence of a given value
    public void delete(int key) {
        Node temp = head, prev = null;

        // If head node itself holds the key
        if (temp != null && temp.data == key) {
            head = temp.next; // change head
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key not found
        if (temp == null) {
            System.out.println("Element not found");
            return;
        }

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    // Display all nodes
    public void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("Linked List is empty");
            return;
        }

        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test linked list operations
    public static void main(String[] args) {
        LinkedListBasic list = new LinkedListBasic();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();  // Output: 10 -> 20 -> 30 -> 40 -> null

        list.delete(20);
        list.display();  // Output: 10 -> 30 -> 40 -> null
    }
}

    
}
