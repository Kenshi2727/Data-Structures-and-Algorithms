import java.util.*;

class fractional_knapsack implements Comparator<fractional_knapsack.Item> {

    static class Item {
        double profit;
        double weight;

        Item(double profit, double weight) {
            this.profit = profit;
            this.weight = weight;
        }
    }

    public int compare(Item a, Item b) {
        double r1 = a.profit / a.weight;
        double r2 = b.profit / b.weight;
        if (r1 < r2)
            return 1;
        else
            return -1;
    }

    static double maxProfit(Item[] items, double capacity) {
        // Sort items based on profit/weight ratio in descending order
        Arrays.sort(items, new fractional_knapsack());

        double maxProfit = 0;
        int n = items.length;

        /*
         * Modified Condition (capacity >= 0):
         * 
         * This condition simply checks if there is any remaining capacity (even if it
         * is less than the weight of the current item).
         * It does not ensure that the current item can be fully included. This causes
         * the algorithm to incorrectly subtract the item's weight from the capacity,
         * even when the capacity is insufficient to include the entire item.
         * This logic leads to the inclusion of more items than the remaining capacity
         * allows, resulting in incorrect calculations and different outputs.
         */
        for (int i = 0; i < n; i++) {
            if (capacity - items[i].weight >= 0) {
                capacity -= items[i].weight;
                maxProfit += items[i].profit;
                System.out.println(maxProfit);
            } else {
                maxProfit += (capacity / (items[i].weight)) * items[i].profit;
                System.out.println(maxProfit);
                break;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Item[] items = new Item[7];
        items[0] = new Item(25, 5);
        items[1] = new Item(75, 10);
        items[2] = new Item(100, 12);
        items[3] = new Item(50, 4);
        items[4] = new Item(45, 7);
        items[5] = new Item(90, 9);
        items[6] = new Item(30, 3);
        int capacity = 37;
        System.out.println("Maximum Profit: " + maxProfit(items, capacity));
        System.out.println(items[6].weight);
    }
}