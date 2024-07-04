
/**
 * count_Inversions
 */
import java.util.Scanner;
import java.util.Arrays;

public class count_Inversions {
    public static int inversionCount(int[] arr, int l, int h) {
        int count = 0;
        if (l < h) {
            // 1. dividing array into two sub problems
            int mid = l + (h - l) / 2;

            // 2. conquer the subproblems using the recursive approach
            count += inversionCount(arr, l, mid);// counting left subarray inversions
            count += inversionCount(arr, mid + 1, h);// counting right subarray inversions

            // 3. combining solution
            count += mergeProcedure(arr, l, mid, h);// counting inversions of sorted arrays(no. of swaps)
        }
        return count;
    }

    public static int mergeProcedure(int[] arr, int l, int mid, int h) {
        int swaps = 0;
        // left subarray
        int[] lsubarray = Arrays.copyOfRange(arr, l, mid + 1); // last elemnt is exclusive
        // right subarray
        int[] rsubarray = Arrays.copyOfRange(arr, mid + 1, h + 1); // last elemnt is exclusive
        int i = 0, j = 0, k = l;
        while (i < lsubarray.length && j < rsubarray.length) {
            if (lsubarray[i] <= rsubarray[j]) {
                arr[k++] = lsubarray[i++];
            } else {
                arr[k++] = rsubarray[j++];
                // calculate no. of swaps
                swaps += (mid + 1) - (l + i);
            }
        }

        // copy all the reaming elements fron left subarray
        while (i < lsubarray.length) {
            arr[k++] = lsubarray[i++];
        }
        // copy all the reaming elements fron right subarray
        while (j < rsubarray.length) {
            arr[k++] = rsubarray[j++];
        }
        return swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 5, 4, 3, 2, 1 };
        int n = arr.length;

        int count = inversionCount(arr, 0, n - 1);
        System.out.println("Number of inversions of given array is " + count);
        sc.close();
    }
}