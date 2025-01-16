import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int flag = 0;
        System.out.println("Enter Any Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println("Found..!!!");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Not Found..!!!");
        }
    }
}
