import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumofnumber2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList(Arrays.asList(10, 20, 30, 100, 150));
        int sum = 170;
        int flag = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num1 = arr.get(i);
            int num2 = sum - num1;
            if (arr.contains(num2)) {
                System.out.println("[" + num1 + "," + num2 + "]");
                flag = 1;
                break;
            }
            if (flag == 0) {
                System.out.println("No pair Found..!!!");
            }
        }
    }
}
