import java.util.*;
public class Sliding_Window {
//we will put indices of elemnts in deque

    public static void maxWindow(int[] arr,int n, int k){
    Deque<Integer> q = new ArrayDeque<>();
    int i;
    //for first k elements
    for(i=0;i<k;i++){
        //remove the elements which are smaller than the current element
        while((!q.isEmpty()) && arr[i]>=arr[q.peekLast()]){
            q.removeLast();
        }

        q.addLast(i);//add elemnts to the queue at rear 
    }
        System.out.print("[");

        //for remaining elements
        for(;i<n;i++){
            System.out.print(arr[q.peek()]+",");

            //remove the elements which are not in the window
            while((!q.isEmpty()) && q.peek()<= i-k ){
               q.removeFirst();
            }
              
            //remove the elements which are smaller than the current element
            while((!q.isEmpty()) && arr[i]>=arr[q.peekLast()]){
                q.removeLast();
            }
            //add the elements to the queue at rear
            q.addLast(i);
        }
        //print the maximum element of the last window
        System.out.print(arr[q.peek()]+"]");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        System.out.println("Enter the size of window:");
        int k= sc.nextInt();
        System.out.println("Maximum elements in the Sliding windows are:");
        maxWindow(arr,n,k);
        sc.close();
    }
}
