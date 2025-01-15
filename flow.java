import java.util.*;

public class flow {

    public static void main(String[] args) {
        System.out.println("Enter Any Number:");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if (no >= 18) {
            System.out.println("Eligible to donate blood..!!!");
        } else {
            System.out.println(" Not Eligible to donate blood..!!");
        }
    }
}
