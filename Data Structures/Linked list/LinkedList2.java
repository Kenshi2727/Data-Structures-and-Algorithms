package Linked_List;
//program for insertion in linkedlist at the beginning
public class LinkedList2 {
    Node head=null;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
         data=d;
         next=null;   
        }
    }
public void insertAtBeginning(int newData)
{
Node newNode=new Node(newData);
//linked list is empty
if(head==null){
    head=new Node(newData);
    return;
}
//if linkedlist not empty

newNode.next=head;
head=newNode;
return;
}

void printNodes()
{
    System.out.println("Linked list:");
    Node current=head;
    while(current!=null){
        System.out.print(current.data+" ");
        current=current.next;
    }
}
public static void main(String[] args) {
    LinkedList2 llist=new LinkedList2();
    llist.insertAtBeginning(1);
    llist.insertAtBeginning(2);
    llist.insertAtBeginning(3);
    llist.insertAtBeginning(4);
    llist.insertAtBeginning(5);
    llist.insertAtBeginning(6);
    llist.printNodes();
}
    
}
