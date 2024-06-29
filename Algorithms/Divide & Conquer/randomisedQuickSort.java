import java.util.Scanner;

/**
 * QuickSort
 */
public class randomisedQuickSort {
    // partition algorithm
    public static int partition(int[] arr, int l, int h) {
        // generate a random number between l and h that is within an array
        int randomIndex = l + (int) Math.random() % (h - l + 1);
        // swap the random index with the first element
        int temp1 = arr[randomIndex];
        arr[randomIndex] = arr[l];
        arr[l] = temp1;
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

    public static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            // Divide the array into subproblems
            int m = partition(arr, l, h);
            // conquer the subproblems via recursion
            quickSort(arr, l, m - 1);
            quickSort(arr, m + 1, h);
        }
    }

    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 50, 20, 70, 90, 10, 13, 17, 21 };
        System.out.println("Array before sorting:");
        int n = arr.length;
        printArr(arr, n);

        quickSort(arr, 0, n - 1);

        System.out.println("Array after sorting:");
        printArr(arr, n);

        sc.close();
    }
}