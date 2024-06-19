package Linked_List;

public class LinkedListRev {
    Node head;
    class Node{
        int data;
        Node next;
        //paraemterized constructor to initalize node
        Node(int d){
        data=d;
        next=null;
        }
    }
    
    void allocate(){
        Node temp=head;
        for(int i=0;i<61;i++){
            Node n=new Node(i);
            if(i==0){
            head=n;
            temp=head;   //updated first node with head
            }
            else
           {
             temp.next=n; //linked first node with current node and updated value in current node
            temp=temp.next;
           }
        }
    }

    //function to print nodes in reverse order(iterative approach)
    void printReverseNodesI(){
        Node prev=null,nextPtr=null,curr=head;
        while(curr!=null){
            nextPtr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextPtr;
        }
        head=prev;
        printNodes();
    }

    //function to print nodes in reverse order(recusrive approach)
    void printReverseNodesR(){
     recurseReverse(null, head);
     printNodes();
    }

     void recurseReverse(Node prev,Node curr){
        //base case
        if(curr==null){
            head=prev;
            return;
        }
        Node nextPtr=curr.next;
        curr.next=prev;//conncetion established in reverse order
        recurseReverse(curr, nextPtr);
    }
    void printNodes()
{
    Node current=head;
    while(current!=null){
        System.out.print(current.data+" ");
        current=current.next;
    }
}
public static void main(String[] args) {
    LinkedListRev llist=new LinkedListRev();
    llist.allocate();
    llist.printNodes();
    System.out.println("\nLinked List after reversal:");
    llist.printReverseNodesI();
    System.out.println("\nOriginal Linked List after applying recursive approach:");
    llist.printReverseNodesR();
}
}
