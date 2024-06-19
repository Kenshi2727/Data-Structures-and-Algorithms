package Linked_List;
import java.util.*;
class Linkedlist
{
    Node head;
    //creating a node class
    class Node
    {
        int data;
        Node next; //pointer
        Node(int d){
            //contsructor to initialize values
            data=d;
            next=null;
        }
    }
    //insert at end
    public void insertAtEnd(int newData){
     //creating a new node to initialize the data entered by the user
     Node newNode=new Node(newData);
     //if linked list is empty
     if(head==null)
     {
        head=newNode;
        return;
     }
     //if linked list not empty
     newNode.next=null;//as there is nothing to point
     Node temp=head;
     while(temp.next!=null)
     {
        temp=temp.next;
     }
     temp.next=newNode;//last node pointer value updated from null to some value
     return;
    }
     public void printNodes(){
        Node current=head;
        while(current!=null)
        {
            if(current==head){
                System.out.print("[");
            }
            if(current.next==null){
                System.out.println(current.data+"]");
                   current=current.next;
            }
            else
            {
            System.out.print(current.data+", ");
            current=current.next;
            }
        }
     }
    public static void main(String[] args) {
         Linkedlist llist=new Linkedlist();
         llist.insertAtEnd(2);
         llist.insertAtEnd(3);
         llist.insertAtEnd(7);
         llist.insertAtEnd(9);
         llist.insertAtEnd(12);
         llist.insertAtEnd(20);
         System.out.println("\nLinked list created by me:");
         llist.printNodes();
         //collection framework
         List<Integer> list=new LinkedList<Integer>();
         list.add(2);
           list.add(3);
             list.add(7);
               list.add(9);
                     list.add(12);
                           list.add(20);
         System.out.println("\nLinked list from collections framework:");
         System.out.println(list);
    }
}