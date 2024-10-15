import java.util.Arrays;
import java.util.Comparator;

/**
 * fractionalKanpsack
 */
public class fractionalKanpsack {

    public static Double maxProfit(int[] profit, int[] weight, int capacity) {
        Double maxProfit = 0.0;
        Double[] ratio = new Double[profit.length];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i] = (double)profit[i] / (double)weight[i];
        }
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Double o1,Double  o2) {
                return (double)ratio[o2] - (double)ratio[o1]; // descending order
            }
        };
        for (int i = 0; i < ratio.length; i++) {
            while (capacity <= 0) {
                int currCapacity = capacity - weight[i];
                if(currCapacity>=0){
                    capacity = currCapacity;

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] profit = { 25, 75, 100, 50, 45, 90, 30 };
        int[] weight = { 5, 10, 12, 4, 7, 9, 3 };
        int capacity = 37;
        System.out.println("Max profit is:" + maxProfit(profit, weight, capacity));
    }
}