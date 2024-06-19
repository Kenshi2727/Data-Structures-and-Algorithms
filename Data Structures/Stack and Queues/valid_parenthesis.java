// Source: LeetCode
import java.util.Stack;
import java.util.Scanner;


public class valid_parenthesis {
    public static boolean isValid(String str){
        char[] chars=str.toCharArray();//converting string to character array
        
        Stack<Character> stack1= new Stack<Character>();//creating a stack
        for(char ele:chars){
            //if the element is an opening bracket, push it into the stack
        if(ele=='(' || ele=='{' || ele=='['){
        stack1.push(ele);
        continue;
        }
        //if the string only contains closed brackets, return false as our stack will be empty and we cannot pop from an empty stack(otherwise it will return true which will be wrong).
        //Consider the case where the string is ")}]". It is invalid but the stack will be empty and the function will return true if below else if condition not written.
        else if(stack1.empty()){
        return false;
        }
        
        char top=stack1.pop();//pop the top element from the stack
        if(top=='(' && ele!=')'){
        return false;
        }
        else if(top=='[' && ele!=']'){
            return false;
        }
        else if(top=='{' && ele!='}'){
            return false;
        }
        }
        return(stack1.empty()==true);//if the stack is empty, return true else return false
        
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Is the string valid? "+isValid(str));
        
    sc.close();
    }
}
