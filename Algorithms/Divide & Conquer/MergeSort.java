/**
 * MergeSort
 * l->lower index(i)
 * r->right index(j)
 */
public class MergeSort {
    public static void mergeProcedure(int[] arr,int l,int mid,int r){
        int i,j,k;
        //size of the left and right subarrays 
        int n1 = mid-l+1;//left subarray
        int n2 = r-mid;//right subarray n2=r-(mid+1)+1=r-mid
        
        //create left and right subarrays
        int[] lsubarray = new int[n1];
        int[] rsubarray = new int[n2];

        //copy the data into the left and right subarrays
        for(i=0;i<n1;i++){
            lsubarray[i] = arr[l+i];
        }

        for(j=0;j<n2;j++){
            rsubarray[j]= arr[mid+1+j];
        }

        //comparison between the elements in left and right subarray
        i=0;
        j=0;
        k=l;//initial index of merged subarray
        while(i<n1 && j<n2){
            if(lsubarray[i]<=rsubarray[j]){
                arr[k]=lsubarray[i]; 
                i++;
            }else{
                arr[k]=rsubarray[j];
                j++;
            }
            k++;
        }

        //best case
        while (i<n1) {
            arr[k]=lsubarray[i];//copy the remaining elements of left subarray
            i++;
            k++;
        }

        //otherwise copy the remaining elements of right subarray
        while (j<n2) {
            arr[k]=rsubarray[j];//copy the remaining elements of right subarray
            j++;
            k++;
        }
    }

    public static void mergeSort(int[]arr,int i,int j){
        if(i<j){
            //divide the array into two subproblems
            int mid = i+(j-i)/2;
            
            //conquer the subproblems using recursion
            mergeSort(arr, i, mid); //left subproblem
            mergeSort(arr, mid+1, j);//right subproblem
        
            //combine the solutions
            mergeProcedure(arr, i, mid, j);
        }
    }

    public static void printArr(int[]arr,int n){
        for (int i = 0; i < n; i++) {
             System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {50,20,40,90,88,11,13};
        int n = arr.length;
        
        System.out.println("Array before sorting: ");
        printArr(arr,n);
        mergeSort(arr, 0, n-1);

        System.out.println("\nArray after sorting: ");
        printArr(arr,n);
    }
}