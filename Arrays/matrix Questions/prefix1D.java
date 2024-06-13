import java.util.*;
public class prefix1D {
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array:");
     int n=sc.nextInt();
     int a[]=new int[n];
    //  int b[]=new int[n];    //Space complexity:O(n)
     System.out.println("Enter elements of array(INTEGER):");
     for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
     //brute force approach
    //  for(int i=0;i<n;i++)  //time complexity:O(n*(n+1))=O(n^2+n)====>>>O(n^2)
    //  {
    //     for(int j=i;j>=0;j--)
    //     b[i]+=a[j];
    //  }
    //  System.out.println("Prefix sum array is:"+Arrays.toString(b));

    //Optimized Approach
    for(int i=1;i<n;i++)  //Time Complexity:O(n)
    {
        a[i]+=a[i-1];     //Space Complexity:O(1)
    }
    System.out.println("Prefix sum array is:"+Arrays.toString(a));
     sc.close();
    }
}
