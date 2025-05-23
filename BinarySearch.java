public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int search = 10;

        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (search == arr[mid]) {
                System.out.println("Element is Found..!!!");
                break;

            } else if (search > arr[mid])
                first = mid + 1;
            else
                last = mid - 1;
        }
        if (first > last)
            System.out.println("Element is Not Found..!!");

    }
}
