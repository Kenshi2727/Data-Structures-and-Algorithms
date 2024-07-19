<a href="https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1">Link to question</a>

# Question-

```
Search in Rotated Sorted Array
Difficulty: MediumAccuracy: 37.64%Submissions: 222K+Points: 4
Given a sorted (in ascending order) and rotated array arr of distinct elements which may be rotated at some point and given an element key, the task is to find the index of the given element key in the array arr. The whole array arr is given as the range to search.

Rotation shifts elements of the array by a certain number of positions, with elements that fall off one end reappearing at the other end.

Note:- 0-based indexing is followed & returns -1 if the key is not present.

Examples :

Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 10
Output: 5
Explanation: 10 is found at index 5.
Input: arr[] = [3, 5, 1, 2], key = 6
Output: -1
Explanation: There is no element that has value 6.
Input: arr[] = [33, 42, 72, 99], key = 42
Output: 1
Explanation: 42 is found at index 1.
Expected Time Complexity: O(log n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 106
1 ≤ key ≤ 105
```

# Solution-

```
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int key = Integer.parseInt(in.readLine().trim());

            out.println(new Solution().search(arr, key));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int search(int[] arr, int key) {
        return search_ele(arr ,0 ,arr.length-1, key);
    }

    public static int binarySearch(int[] A, int l, int h,int key){
        if(h<l)
            return -1;
        int m=(l+h)/2;
        if(key==A[m])
            return m;
        else if(key>A[m])
            return binarySearch(A,m+1,h,key);
        else
            return binarySearch(A,l,m-1,key);
    }

    public static int findPivot(int[] A,int l,int h){
        if(h<l)
            return -1;
        int m=(l+h)/2;
        if(m<h && A[m]>A[m+1])
            return m;
        if(m>l && A[m-1]>A[m])
            return m-1;

        if(A[l]>A[m])
            return findPivot(A,l,m-1);
        else
            return findPivot(A,m+1,h);
    }

    int search_ele(int[] A ,int l ,int h, int key){
        int pivot = findPivot(A,l,h);
        if(pivot==-1)
             return binarySearch(A,l,h,key);
        if(A[pivot]==key)
             return pivot;
        if(key>=A[l])
            return binarySearch(A,l,pivot -1,key);
        else
            return binarySearch(A,pivot +1,h,key);
    }
}
```
