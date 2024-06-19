package Linked_List;

public class LinkedCycle {
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
        for(int i=0;i<7;i++){
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
    
    void convertToCycle(){
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=head;
    }

    boolean detectCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && slow!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedCycle lc=new LinkedCycle();
        lc.allocate();
        lc.printNodes();
        lc.convertToCycle();
        System.out.println();
        if(lc.detectCycle()){
            System.out.println("Cycle detected");
        }
        else{
               System.out.println("Cycle not detected");
        }
        
    }
}
 