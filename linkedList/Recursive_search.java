public class Recursive_search {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Recursive search helper
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        return (idx == -1) ? -1 : idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // Reverse Linked List
    public void reverse() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



    //FIND and Remove Nth node from End:

    public void deleteNthfromEnd(int n){
        //calculate size:
        int size=0;
        Node temp=head;
        while(temp !=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        int i=1;

        int iToFind=size-n;
        while(i<iToFind){
            head=head.next;
            i++;
        }
        head.next=head.next.next;
        return; 
    }



    public static void main(String args[]) {
        Recursive_search l1 = new Recursive_search();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(3);

        System.out.print("Original List: ");
        l1.printList();

        l1.reverse();
        System.out.print("Reversed List: ");
        l1.printList();

        int key = 4;
        int idx = l1.recSearch(key);
        System.out.println("Index of " + key + ": " + idx);

        l1.deleteNthfromEnd(2);
        System.out.print("List after deleting 2nd node from end: ");
        l1.printlist(reverse);
    
    }

}