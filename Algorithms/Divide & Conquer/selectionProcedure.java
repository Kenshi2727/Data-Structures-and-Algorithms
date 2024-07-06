import java.util.Scanner;
/**
 * selectionProcedure
 */
public class selectionProcedure {
 // partition algorithm
 public static int partition(int[] arr, int l, int h) {
    int i = l;
    int j = h;
    // pivot as the first element
    int pivot = arr[l];
    for (j = l + 1; j <= h; j++) {
        /*
         * j->take care of the bigger elemnts than the pivot element
         * i->take care of the smaller elements than the pivot element
         */
        if (arr[j] <= pivot) {
            i++;
            // swap the elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    // swap the pivot element to return the correct position of the pivot element
    int temp = arr[i];
    arr[i] = arr[l];
    arr[l] = temp;

    return i;// return the correct position of the pivot element
}

public static int quickSort(int[] arr, int l, int h,int k) {
    if (l < h) {
        // Divide the array into subproblems
        int m = partition(arr, l, h);
        // conquer the subproblems via recursion
        if(m==k-1){
            return arr[m];
        }
        else if(m<k-1){
        return quickSort(arr,m+1,h,k);//right side
        }
        else
        return quickSort(arr, l, m - 1, k);//left side
    }
    return -1;
}

public static void printArr(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        System.out.println("Enter value of k:");
        int k=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is:");
        printArr(arr, n);
        System.out.println(k+"th smallest element is:"+quickSort(arr, 0, n-1, k));
        sc.close();    
    }
}