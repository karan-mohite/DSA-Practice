import java.util.*;

public class JuiceWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of apple juices:");
        int juice1 = sc.nextInt();

        System.out.println("Enter the quantity of apple juices:");
        int juice2 = sc.nextInt();

        System.out.println("Enter the quantity of apple juices:");
        int juice3 = sc.nextInt();

        int minTime = calculateMinimumTime(juice1, juice2, juice3);
        System.out.println("Minimum time is:" + minTime);
    }

    private static int calculateMinimumTime(int juice1, int juice2, int juice3) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.add(juice1);
        pq.add(juice2);
        pq.add(juice3);

        int second = 0;
        while (!pq.isEmpty()) {
            int j1 = 0;
            int j2 = 0;

            Iterator itr = pq.iterator();
            if (itr.hasNext()) {
                j1 = pq.remove();
            }
            if (itr.hasNext()) {
                j2 = pq.remove();
            }
            if (j1 > 0 && j2 == 0) {
                second += j1;
                break;
            }
            if (j1 > 0 && j2 > 0) {
                second++;
                j1--;
                j2--;
            }
            if (j1 > 0) {
                pq.add(j1);
            }
            if (j2 > 0) {
                pq.add(j2);
            }
        }
        return second;
    }
}
