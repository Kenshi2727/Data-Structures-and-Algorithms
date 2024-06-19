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
         //str.charAt(i)=='I' means we will pop all the elements from the stack till we get the I
        if(i==str.length() || str.charAt(i)=='I'){//DO NOT REVERSE THE CONDITION ELSE IT WILL GIVE ERROR AS STRING INDEX OUT OF BOUND EXCEPTION
            while(!stack.isEmpty()){              //YOU CAN CHECK FOR YIURSELF BY REVERSING THE CONDITION AND THEN RUNNING THE CODE FOR INPUT="II"  
                System.out.print(stack.pop());
                
            }
        }
    }
    // System.out.println(stack);
}
}
