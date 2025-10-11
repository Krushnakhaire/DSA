import java.util.Scanner;

public class InsertionAthead {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void InsertionAthead(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void display(){
        Node tempNode=head;
        while(tempNode!=null){
            System.out.print(tempNode.data + " ");
            tempNode=tempNode.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        InsertionAthead list=new InsertionAthead();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to insert at head?");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++){
            int data = sc.nextInt();
            list.InsertionAthead(data);
        }
        System.out.println("Linked List after insertion at head:");
        list.display();
    }
}