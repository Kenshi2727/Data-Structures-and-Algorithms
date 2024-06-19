package Linked_List;
public class LinkedMiddle {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
          this.data=data;
          next=null;
        }
    }
    void allocate(){
        Node temp=head;
        for(int i=0;i<9;i++){
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
    void printNodes()
    {
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    
    //my own logic
    int middle1(){
     int c=0;
     Node current =head;
     while(current!=null){
        c++;
        current=current.next;
     }
    
        c=c/2;
     
     Node temp=head;
     for(int i=0;i<c;i++){
      temp=temp.next;
     }
     return temp.data;
    }
    //two pointer approach
    int middle2(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        LinkedMiddle lm=new LinkedMiddle();
        lm.allocate();
        System.out.println("Linked list is:");
        lm.printNodes();
        System.out.println("\nMiddle of Linked list is:"+lm.middle1());
        System.out.println("\nMiddle of Linked list is(two pointer approach):"+lm.middle2());
    }
}
