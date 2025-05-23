import java.util.*;

public class CurrencyExchange2 {

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
        insertionsort(currency);
        exchange(currency, exchangeAmount);
    }

    public static void insertionsort(int arr[]) {
        int temp, j;
        for (int k = 1; k < arr.length; k++) {
            temp = arr[k];
            j = k - 1;
            while (j >= 0 && temp >= arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    private static void exchange(int[] currency, int exchangeAmount) {
        int notes[] = new int[currency.length];
        int noteCount = 0;
        for (int i = 0; i < currency.length; i++) {
            notes[i] = exchangeAmount / currency[i];
            exchangeAmount = exchangeAmount % currency[i];
            noteCount += notes[i];

            if (notes[i] != 0)
                System.out.println(String.format("%d X %d", notes[i], currency[i]));
        }
        System.out.println("After sorting " + Arrays.toString(notes));
    }
}
