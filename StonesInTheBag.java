import java.util.Collections;
import java.util.PriorityQueue;

public class StonesInTheBag {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 5, 10, 15 };

        PriorityQueue<Integer> stones = new PriorityQueue(Collections.reverseOrder());
        for (int n : arr)
            stones.add(n);

        while (stones.size() > 1) {
            int n1 = stones.remove();
            int n2 = stones.remove();

            int diff = n1 - n2;

            if (diff > 0) {
                stones.add(diff);
            }
        }
        if (stones.isEmpty()) {
            System.out.println("No Stones Left..!!");
        } else {
            System.out.println(stones.remove() + "kg stone left");
        }
    }
}
