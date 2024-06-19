import java.util.*;
public class stackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    //Function to push an element into stack using two queues.
    static void add(int data){
        //move all elements from q1 to q2.
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll(); //remove the element from q1. Don't use remove() as it throws exception if queue is empty.
        }

        //add the new element to q1.
        q1.add(data);

        //move all elements from q2 to q1.
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll(); 
        }
    }

    //Function to pop an element from stack using two queues.
    static int remove(){
        //if first queue is empty.
        if(q1.isEmpty()){
            System.out.println("Stack Underflow");
        }
        //else we remove the front element from q1 and return it.
        int ele = q1.peek();
        q1.poll();//remove the element from q1.
        return ele;
    }
    
    public static void main(String[] args) {
      stackUsingQueue s = new stackUsingQueue();
        
      //pushing elements into the stack.
        s.add(2);
        s.add(5);
        s.add(9);
        s.add(12);

        //popping elements from the stack.
        System.out.println("Deleted element from the stack is:"+s.remove());
        System.out.println("Deleted element from the stack is:"+s.remove());
        System.out.println("Deleted element from the stack is:"+s.remove());
        System.out.println("Deleted element from the stack is:"+s.remove());
        System.out.println("Deleted element from the stack is:"+s.remove());
    }
    
}
