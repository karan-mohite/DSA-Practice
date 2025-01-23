import java.util.*;

public class currencyExchange3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of currency denominations:");
        int size = sc.nextInt();

        int currency[] = new int[size];
        System.out.println("Enter the" + size + "Currency denominations in random order");
        for (int i = 0; i < size; i++) {
            currency[i] = sc.nextInt();

        }
        System.out.print("Enter the exchange amount:");
        int exchangeAmount = sc.nextInt();
        exchange(currency, exchangeAmount);
    }

    private static void exchange(int[] currency, int exchangeAmount) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int n : currency)
            pq.add(n);

        int noteCount = 0;
        while (exchangeAmount > 0) {

            int curr = pq.remove();
            int notes = exchangeAmount / curr;
            exchangeAmount = exchangeAmount % curr;
            noteCount += notes;

            if (notes != 0)
                System.out.println(String.format("%d X %d", notes, curr));
        }
        System.out.println("Total Notes:" + noteCount);

    }
}