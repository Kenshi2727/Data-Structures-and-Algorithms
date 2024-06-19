class lowerBound
{
    //function definition
    public static int searchElement(int a[],int target,int low,int high)
    {
    while(low<=high)
    {
        int mid=high-(high-low)/2;  //to prevent overflow condition
        //base case
        if(a[mid]==target)
        {
            searchElement(a, target, low, mid-1);  //updating value of high
            return mid;
        }
        else if(a[mid]<target)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) 
    {
        int[]a={2,4,7,9,12,7,14};
        //array assumed to be in ascending order
        System.out.println("lower bound is "+lowerBound.searchElement(a, 7,0,a.length));
    }
}