import java.util.Stack;

public class histogram84 {
    public static int getMaxArea(int hist[],int n){
        Stack<Integer> s = new Stack<>();

        int max_area = 0;//initialize the maximum area
        int tp;//to store the top of the stack
        int area_with_top;//to store the area with top bar as the smallest bar

        int i=0;
        while(i<n){
            //if this bar is higher than the bar on top stack, push it to stack

            if(s.empty() || hist[s.peek()]<=hist[i]){
                s.push(i++);  //post increment  s=0 i=1
            }
            else{
                tp = s.peek(); //store the top index
                s.pop();//pop the top to calculate the area 

                area_with_top = hist[tp]*(s.empty()?i:i-s.peek()-1);

                //update the maximum area if needed
                if(max_area<area_with_top){
                    max_area = area_with_top;
                }
            }
        }


        //now pop the remaining bars from the stack and calculate the area 
        while(s.empty()==false){
            tp = s.peek(); //store the top index
            s.pop();//pop the top to calculate the area 

            area_with_top = hist[tp]*(s.empty()?i:i-s.peek()-1);

            //update the maximum area if needed
            if(max_area<area_with_top){
                max_area = area_with_top;
        }
    }
    return max_area;
}
   public static void main(String[] args) {
        int hist[]={6,2,5,4,5,1,6};
        System.out.println("Maximum area of histogram is: "+getMaxArea(hist,hist.length));
   } 
}
