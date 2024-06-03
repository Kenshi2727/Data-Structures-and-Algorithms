import java.util.*;
public class Deque_Implement {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        deque.addLast(5);
        deque.addLast(7);
        deque.addLast(9);

        System.out.println("Deque output:"+deque);

        // deque.removeLast();
        // System.out.println("Deque output after deletion:"+deque);

        // queue implementation
        deque.removeFirst();
        System.out.println("Deque output after deletion:"+deque);
    }
}
