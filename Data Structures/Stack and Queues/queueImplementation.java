/**
 * queueImplementation
 */
import java.util.*;
public class queueImplementation {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //add the data inside the queue
        for(int i=1; i<=10; i++){
            q.add(i);
        }

        System.out.println("queue data looks like:"+q);
        
        //peek the data from the queue(display top element)
        System.out.println("top element of the queue before deletion:"+q.peek());
        //remove the data from the queue
        int removed = q.remove();

        //peek the data from the queue(display top element)
        System.out.println("top element of the queue after deletion:"+q.peek());


        //check the size of the queue
        System.out.println("Current size of the queue:"+q.size());
    }
}