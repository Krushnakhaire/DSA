public class Linkedlist_basic1 {
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this .data=data;
            this .next=null;
        }
    }
    public static Node head;
    public static Node tail;


    //element add at 1st side:
    public void addfirst(int data){
        //step1=create new node 
        Node newNode=new Node(data);
        if(head == null){
            head = tail=newNode;
            return;
        }
        //step2-newNode next = head
        newNode.next=head;

        //step3-head=newNode
        head=newNode;
    }

    //element add at last side:
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }


    //print Linkedlist:
    public void print(){
        if(head == null){
            System.out.println("linkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //add Node in Middle:
public void add(int idx,int data){
    Node newNode=new Node(data);
    Node temp=head;
    int i=0;

    while(i<idx-1){
        temp=temp.next;
    }

    //i=idx-1 ; temp->prev
    newNode.next=temp.next;
    temp.next=newNode;
}

    public static void main(String args[]){
     Linkedlist_basic1 l1=new Linkedlist_basic1();

     l1.addfirst(0);
     l1.addfirst(2);
     l1.print();
     l1.add(2,9);
     l1.add(3,7);
     l1.print();
     l1.addLast(3);
     l1.addLast(4);
     l1.addLast(4);
     l1.print();
    }
    
}
