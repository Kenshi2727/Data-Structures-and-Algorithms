import java.util.Scanner;

public class Maxima_Minima {
    static class Pair {
        int min;
        int max;
    }

    // function definition
    public static Pair getMinMax(int[] arr, int i, int j) {
        Pair minmax = new Pair();// object of Pair class
        Pair minmaxLeft = new Pair();// for left side
        Pair minmaxRight = new Pair();// for right side
        // if only one element is present(SMALL PROBLEM)
        if (i == j) {
            minmax.max = arr[i];
            minmax.min = arr[i];
        }
        // if only two elements are present(SMALL PROBLEM)
        else if (i == j - 1) {

            if (arr[i] < arr[j]) {
                minmax.min = arr[i];
                minmax.max = arr[j];
            } else {
                minmax.min = arr[j];
                minmax.max = arr[i];
            }
        }

        // big problem
        else {
            int mid = i + (j - i) / 2;
            minmaxLeft = getMinMax(arr, i, mid);// left subtree
            minmaxRight = getMinMax(arr, mid + 1, j);// right subtree

            // comparing the minimum values of left and right
            if (minmaxLeft.min < minmaxRight.min) {
                minmax.min = minmaxLeft.min;
            } else {
                minmax.min = minmaxRight.min;
            }
            // comparing the maximum values of left and right
            if (minmaxLeft.max > minmaxRight.max) {
                minmax.max = minmaxLeft.max;
            } else {
                minmax.max = minmaxRight.max;
            }
        }
        return minmax;// returning the object of Pair class
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elemnts in array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // function to find minimum and maximum element in the array
        Pair minmax = getMinMax(arr, 0, n - 1);
        System.out.println("Minimum element is: " + minmax.min);
        System.out.println("Maximum element is: " + minmax.max);
        sc.close();
    }
}
