import java.util.Scanner;

public class SinglyLinkedList {
    public static void main(String[] args) {
        Node head = null;
        head = create(head);
        display(head);
    }

    private static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    private static Node create(Node head) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of linked List:");
        int size = sc.nextInt();
        Node temp = null;
        for (int i = 1; i <= size; i++) {
            System.out.println("Enter Data for Node " + i + " :");
            int info = sc.nextInt();
            Node nn = new Node(info);
            if (head == null) {
                head = nn;
                temp = nn;
            } else {
                temp.next = nn;
                temp = temp.next;
            }
        }
        return head;
    }
}
