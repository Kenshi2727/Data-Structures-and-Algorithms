import java.util.Scanner;
class rotationMatrix {
    public static void rotation(int arr[][]) //clockwise 90 degrees
    {
        //transpose of matrix
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr[0].length;j++) //j=i otherwise double swapping would occur
            {
             int temp=arr[i][j];
             arr[i][j]=arr[j][i];
             arr[j][i]=temp;
            }
        }
        int left=0,right=arr.length-1;
        //swapping column wise
       
        for(int i=0;i<arr.length;i++)
        {
            left=0;right=arr.length-1;

             while(left<=right)
        {
        int temp=arr[i][left];
        arr[i][left]=arr[i][right];
        arr[i][right]=temp;

        left++;
        right--;
        }
        }
        System.out.println("Rotated matrix is:");
         for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
             System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=4, n=4;  //row and column
        int a[][]=new int[m][n];
        System.out.println("Enter matrix elemnts:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
             a[i][j]=sc.nextInt();
            }
        }
        rotation(a);
        sc.close();
    }
}