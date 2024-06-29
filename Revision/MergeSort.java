import java.util.Scanner;

public class MergeSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static int mergeProcedure(int[] arr, int l, int mid, int h) {
        int i = 0, j = mid;
        while (i < l && j < h) {
            if (i == j) {
                return mid;
            } else {

            }
        }
    }

    public static void mergeSort(int[] arr, int i, int j) {
        while (i < j) {
            int mid = i - (i - j) / 2;
            mergeSort(arr, i, mid);
            mergeSort(arr, mid + 1, j);
            mergeProcedure(arr, i, mid, j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}
