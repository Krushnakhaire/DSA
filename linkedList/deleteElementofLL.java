import java.util.Scanner;
public class deleteElementofLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void insertNode (int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }
    public void deleteElement(int key) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }
        if (head.data == key) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Element not found in the list");
        } else {
            current.next = current.next.next;
        }
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
        deleteElementofLL list = new deleteElementofLL();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to insert?");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insertNode(data);
        }
        System.out.println("Linked List before deletion:");
        list.display();

        System.out.println("Enter the element to delete:");
        int key = sc.nextInt();
        list.deleteElement(key);
        
        System.out.println("Linked List after deletion:");
        list.display();
    }
    
}
