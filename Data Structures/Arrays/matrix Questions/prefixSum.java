import java.util.Scanner;
class operations
{
static int prefixSumMatrix(int a[][],int m,int n,int r1,int c1,int r2,int c2)
{
    //row wise prefix sum
    for(int i=1;i<m;i++)
    {
        for(int j=0;j<n;j++)
        a[i][j]+=a[i-1][j];     
    }
     //column wise prefix sum
    for(int i=0;i<m;i++)  
    {
        for(int j=1;j<n;j++)
        a[i][j]+=a[i][j-1];     
    }
    return result(a,r1,c1,r2,c2);
}
static int result(int arr[][],int rr1,int cc1,int rr2,int cc2)
{
    int sum,left,up,common;
    if(rr1==0 && cc1==0)
    {
    sum=arr[rr2][cc2];
    left=0;
    up=0;
    common=0;
    }
    else if(rr1==0 && cc1!=0)
    {
    sum=arr[rr2][cc2];
    left=arr[rr2][cc1-1];
    up=0;
    common=0;
    }
      else if(rr1!=0 && cc1==0)
    {
    sum=arr[rr2][cc2];
    left=0;
    up=arr[rr1-1][cc2];
    common=0;
    }
    else
    {
    sum=arr[rr2][cc2];
    left=arr[rr2][cc1-1];
    up=arr[rr1-1][cc2];
    common=arr[rr1-1][cc1-1];
    }
    return (sum-left-up+common);
}

}
public class prefixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter row and column:");
         int m=sc.nextInt();
         int n=sc.nextInt();
        int a[][]=new int[m][n];
        //input
        System.out.println("Enter matrix elemnts:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
             a[i][j]=sc.nextInt();
            }
        }
          System.out.println("Enter coordinate of first element:");
          int r1=sc.nextInt();
          int c1=sc.nextInt();
          System.out.println("Enter coordinate of second element:"); 
          int r2=sc.nextInt();
          int c2=sc.nextInt();

        //bruteforce approach
        // int sum=0;
        //   for(int i=r1;i<=r2;i++)  //time complexity: O(m*n)
        // {
        //     for(int j=c1;j<=c2;j++)
        //     {
        //      sum+=a[i][j];
        //     }
        // }
        // System.out.println("Sum is "+sum); 
      
        //optimised approach
        System.out.println("Sum is "+operations.prefixSumMatrix(a,m,n,r1,c1,r2,c2));
        sc.close();
    }
}
