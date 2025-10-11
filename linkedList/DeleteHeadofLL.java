import java.util.Scanner;

public class DeleteHeadofLL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }
        head = head.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        DeleteHeadofLL list = new DeleteHeadofLL();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to insert at head?");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insertAtHead(data);
        }
        System.out.println("Linked List before deleting head:");
        list.display();

        list.deleteHead();
        System.out.println("Linked List after deleting head:");
        list.display();

    }
}