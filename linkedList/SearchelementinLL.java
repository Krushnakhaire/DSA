import java.util.Scanner;

public class SearchelementinLL {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String args[]) {
        SearchelementinLL list = new SearchelementinLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        if (list.search(key)) {
            System.out.println("Element found in the linked list");
        } else {
            System.out.println("Element not found in the linked list");
        }
        sc.close();
    }
}