public class LinearSearch3 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = 100;
        LinearSearch(arr, n);
    }

    private static void LinearSearch(int arr[], int n) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Number is Found..!!");
                break;
            }
        }
        if (i == arr.length) {
            System.out.println("Number is not found..!!!");
        }
    }
}
