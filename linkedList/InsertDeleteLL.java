 import java.util.Scanner;
public class InsertDeleteLL {
   


    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    void delete(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Element not found");
            return;
        }
        prev.next = temp.next;
    }

    void display() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertDeleteLL list = new InsertDeleteLL();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for node " + (i+1) + ": ");
            int data = sc.nextInt();
            list.insert(data);
        }

        list.display();

        System.out.print("Enter value to delete: ");
        int del = sc.nextInt();
        list.delete(del);

        list.display();
    }
}

    

