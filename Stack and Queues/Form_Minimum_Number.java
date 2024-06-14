import java.util.*;
/**
 * Form_Minimum_Number
 */
public class Form_Minimum_Number {
public static void main(String[] args) {
    String str = "IIDID";
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<=str.length();i++){
        stack.push(i+1);
        if(i==str.length() || str.charAt(i)=='I'){ //str.charAt(i)=='I' means we will pop all the elements from the stack till we get the I
            while(!stack.isEmpty()){
                System.out.print(stack.pop());
                
            }
        }
    }
    // System.out.println(stack);
}
}
