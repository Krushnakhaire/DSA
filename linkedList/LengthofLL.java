class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LengthofLL {

    Node head;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=newNode;
        }
        }
    public int length(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String args[]){
        LengthofLL list=new LengthofLL();
        list.insert(10);
        list.insert(20);
        System.out.println("Length of linked list: "+list.length());
    }

    
}
