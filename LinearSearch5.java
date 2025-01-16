public class LinearSearch5 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = 50;
        int result = LinearSearch(arr, n);
        String display = result == -1 ? "Not Found" : "Found at index:" + result;
        System.out.println(display);
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
