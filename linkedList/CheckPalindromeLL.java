class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CheckPalindromeLL {

    private static Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;   
    }

    private static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) 
            return true;

        Node mid = findMidNode(head);
        Node secondHalfHead = reverse(mid.next);

        Node left = head;
        Node right = secondHalfHead;
        boolean result = true;

        while (right != null) {
            if (left.data != right.data) {
                result = false;
                break;
            }
            left = left.next;
            right = right.next;
        }

        mid.next = reverse(secondHalfHead);
        return result;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        if (isPalindrome(head)) {
            System.out.println("Linked List is a Palindrome");
        } else {
            System.out.println("Linked List is NOT a Palindrome");
        }
    }
}
