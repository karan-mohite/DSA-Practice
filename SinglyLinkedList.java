import java.util.Scanner;

public class SinglyLinkedList {
    public static void main(String[] args) {
        Node head = null;
        head = create(head);
        System.out.println("Display After Creation:");
        display(head);

        head = addFirst(head);
        System.out.println("Display After Adding at first position:");
        display(head);

        addLast(head);
        System.out.println("Display After Adding at Last position:");
        display(head);

    }

    private static Node addLast(Node head) {
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        Node nn = getNode();
        return temp.next = nn;

    }

    private static Node addFirst(Node head) {
        Node nn = getNode();
        nn.next = head;
        head = nn;
        return head;
    }

    private static Node getNode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data for Node:");
        int info = sc.nextInt();
        Node newNode = new Node(info);
        return newNode;
    }

    private static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL\n");
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
