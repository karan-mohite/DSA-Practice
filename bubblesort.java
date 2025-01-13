import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = { 6, 7, 2, 5, 3 };
        System.out.println("Before:" + Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("After:" + Arrays.toString(arr));
    }

    private static void bubblesort(int arr[]) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
