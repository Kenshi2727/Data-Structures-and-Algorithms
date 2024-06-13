import java.util.Scanner;
class solution
{
static int answer(int num)
{
int[] a=new int[(num/2)+1];
//array prepared
for(int i=0;i<=num/2;i++)
a[i]=i;

//applying binary serach
int low=0,high=num/2,mid,result=0;
while(low<=high)
{
    mid=high-(high-low)/2;
    if((a[mid]*a[mid])==num)
    {
        result=mid;
        return result;
    }
    else if((a[mid]*a[mid])<num)
    {
        result=mid;  //can be floor value
        low=mid+1;
    }
    else
    {
        high=mid-1;
    }
}
return result;
}
}

public class squareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find its square root:");
        int num=sc.nextInt();
        System.out.println("Answer is "+solution.answer(num));
        sc.close();
    }
}
