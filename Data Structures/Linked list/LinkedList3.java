package Linked_List;

public class LinkedList3 {
    Node head;
    class Node
    {
     int data;
     Node next;
     Node(int d){
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


//insert at beginning
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

//insert at any node
     public void insertAtAnyNode(int newData,int position){
        Node newNode=new Node(newData);
        //if linked list is empty
        if(head==null){
            head=newNode;
            return;
        }
        //if linked list is not empty
        Node prev_Node=null;
        Node temp=head;
        for(int i=0;i<position;i++){
            prev_Node=temp;
            temp=temp.next;
        }
        newNode.next=prev_Node.next;
        prev_Node.next=newNode;
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
        LinkedList3 llist=new LinkedList3();
        llist.insertAtBeginning(17);
         llist.insertAtBeginning(18);
          llist.insertAtBeginning(56);
           llist.insertAtBeginning(45);
            llist.insertAtBeginning(10000000);
             llist.insertAtBeginning(1000000000);
              llist.insertAtBeginning(100);
        llist.insertAtAnyNode(9658, 1);
            llist.insertAtAnyNode(765, 1);
                llist.insertAtAnyNode(7800, 1);
                    llist.insertAtAnyNode(98, 1);
        llist.insertAtEnd(567);
        llist.printNodes();
    }
}
