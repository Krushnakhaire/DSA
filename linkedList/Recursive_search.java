import java.util.LinkedList;

public class Recursive_search {

    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data=key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx == -1){
            return idx+1;
        }

        public int recSearch(int kay){
            return helper(head,key);
        }

        public static void main(String args[]){
            LinkedList<E> l1=new LinkedList();
            l1.addFirst(2);
            l1.addFirst(1);
            l1.addLast(4);
            l1.addaLast(5);
            l1.add(3,4);
            l1.add(2,3);


        }
    }
    
}
