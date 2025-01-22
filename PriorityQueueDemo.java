import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 5, 10, 15 };

        PriorityQueue<Integer> stones = new PriorityQueue(Collections.reverseOrder());
        for (int n : arr)
            stones.add(n);

        if (stones.size() > 1) {
            int n1 = stones.remove();
            int n2 = stones.remove();
            System.out.println("Difference between two heaviest stone is :" + (n1 - n2));
        } else {
            System.out.println("Please enter minimum 2 stones..!!");
        }
    }
}
