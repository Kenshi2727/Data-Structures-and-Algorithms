import java.util.*;
public class stackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
                stack1.push(2);
                stack1.push(4);
                stack1.push(6);
                stack1.push(9);

                //print the topmost element
                System.out.println("topmost element is:"+stack1.peek());

                //deleting top element
                stack1.pop();

                //print the topmost element after deletion
                System.out.println("topmost element after deletion is:"+stack1.peek());

                //seraching element in stack
                System.out.println("Element 4 found at position:"+stack1.search(4));

                //checking if stack is empty
                System.out.println("Is stack empty?:"+stack1.empty());
    }
}
