import java.util.*;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("Enter Your Name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter Your Age:");
        Scanner sc1 = new Scanner(System.in);
        int age = sc1.nextInt();
        System.out.println("Name of Student is:" + name);
        System.out.println("Age of Student :" + age);
    }
}
