package Linked_List;
import java.util.Scanner;
public class LinkedList4 {
    Scanner sc=new Scanner(System.in);
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
        data=d;
        next=null;
        }
 }
void allocate(){
      Node n1=new Node(1);
      head=n1;
    head.next=new Node(2);
        head.next.next=new Node(3);
            head.next.next.next=new Node(4);
                head.next.next.next.next=new Node(5);
                    head.next.next.next.next.next=new Node(6);
                        head.next.next.next.next.next.next=new Node(7);
                            head.next.next.next.next.next.next.next=new Node(8);
        
       }
        void printNodes(){
        Node currentNode=head;
        while(currentNode!=null){
          System.out.print(currentNode.data+" ");
          currentNode=currentNode.next;
        }
       }

       //for deletion in linked list
       void delete(int position){
        //deletion in beginning
        if(position==0){
            Node temp=head;
            head=temp.next;
            return;
        }       
        //not from beginning
         Node prevNode=head;
         for(int i=0;i<position-1 && prevNode!=null;i++){
            prevNode=prevNode.next;
         }
         //checking for empty node
         if(prevNode==null || prevNode.next==null){
            return;
         }
         prevNode.next=prevNode.next.next;//linkage broken and restablished with the next following node
         return;//deletion successful
       }
       public static void main(String[] args) {
        LinkedList4 llist=new LinkedList4();
         llist.allocate();
         System.out.println("Linked list before deletion:");
        llist.printNodes();
        llist.delete(7);
        llist.delete(6);
        llist.delete(5);
        llist.delete(4);
        llist.delete(3); 
        llist.delete(2);
        /**ANY OTHER ORDER OF FUNCTION CALL WILL NOT DELETE THE ELEMNETS AT DESIRED POSITION
           AS WITH EACH DELETION ;INKED LIST SIZE CHANGES HENCE POSITION OF EACH ELEMENT CHANGES**/                               
        System.out.println("\nLinked list after deletion:");
        llist.printNodes();
       }
    }

