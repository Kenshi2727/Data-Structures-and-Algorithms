import java.util.*;

/**
 * jobScheduling
 */
public class jobScheduling {
    char id;
    int deadline, profit;

    public jobScheduling() {
    }

    public jobScheduling(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    void printJobSequences(ArrayList<jobScheduling> arr, int maxDeadline) {
        int n = arr.size();
        // sort jobs in decreasing order of profit
        Collections.sort(arr, (a, b) -> b.profit - a.profit);// lambda expression to sort in descending order

        // keep track of booked slots
        boolean[] result = new boolean[maxDeadline];
        // storing job ids
        char[] jobs = new char[maxDeadline];

        // store the job ids acc. to the given deadline
        for (int i = 0; i < n; i++) {
            for (int j = Math.min(maxDeadline - 1, arr.get(i).deadline - 1); j >= 0; j--) {
                if (result[j] == false) {
                    result[j] = true;
                    jobs[j] = arr.get(i).id;
                    break;
                }
            }
        }

        for (char id : jobs) {
            System.out.print(id + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<jobScheduling> arr = new ArrayList<>();
        arr.add(new jobScheduling('1', 5, 55));
        arr.add(new jobScheduling('2', 2, 65));
        arr.add(new jobScheduling('3', 7, 75));
        arr.add(new jobScheduling('4', 3, 60));
        arr.add(new jobScheduling('5', 2, 70));
        arr.add(new jobScheduling('6', 1, 50));
        arr.add(new jobScheduling('7', 4, 85));
        arr.add(new jobScheduling('8', 5, 68));
        arr.add(new jobScheduling('9', 3, 45));

        System.out.println("Job sequences to get the maximum profit:");

        jobScheduling job = new jobScheduling();
        job.printJobSequences(arr, 7);
    }
}