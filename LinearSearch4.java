public class LinearSearch4 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = 10;
        int result = LinearSearch(arr, n);
        if (result == -1) {
            System.out.println("Not Found..!!!");
        } else {
            System.out.println("Found at index" + result);
        }
    }

    private static int LinearSearch(int arr[], int n) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
