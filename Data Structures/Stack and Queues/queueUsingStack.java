import java.util.*;
/**
 * queueUsingStack
 */
public class queueUsingStack {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    static void enQueue(int data){
        stack1.push(data);
    }

    // deletion

    static int deQueue(){
        int ele;
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }

        //push all elements from stack1 to stack2
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                // stack2.push(stack1.pop());
                ele=stack1.pop();
                stack2.push(ele);

            }
        }
        // return top element from stack2 to implement FIFO architecture
        ele=stack2.pop();
        return ele;
    }

    public static void main(String[] args) {
        queueUsingStack q = new queueUsingStack();

        // insertion in queue
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        // deletion in queue
       System.out.println("Deleted element is"+q.deQueue()); 
       System.out.println("Deleted element is"+q.deQueue()); 
       System.out.println("Deleted element is"+q.deQueue()); 
       System.out.println("Deleted element is"+q.deQueue()); 
       System.out.println("Deleted element is"+q.deQueue()); 
        // q.deQueue();
       
       
    }
}