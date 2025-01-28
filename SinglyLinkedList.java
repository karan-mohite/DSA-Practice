import java.util.Scanner;

public class SinglyLinkedList {
    public static void main(String[] args) {
        Node head = null;
        Scanner sc = new Scanner(System.in);
        head = create(head);
        System.out.println("Display After Creation:");
        display(head);

        head = addFirst(head);
        System.out.println("Display After Adding at first position:");
        display(head);

        addLast(head);
        System.out.println("Display After Adding at Last position:");
        display(head);

        System.out.println("Enter the positon of new node");
        int aposition = sc.nextInt();
        addMid(head, aposition);
        System.out.println("Display After Adding At " + aposition + "nth position:");
        display(head);

        head = deleteFirst(head);
        System.out.println("Display After Deleting Adding at first position:");
        display(head);

        deleteLast(head);
        System.out.println("Display After Deletion at last position:");
        display(head);

        System.out.println("Enter the positon of new node");
        int dposition = sc.nextInt();
        deleteMid(head, dposition);
        System.out.println("Display After deleting From " + dposition + "position:");
        display(head);
    }

    private static void deleteMid(Node head, int dposition) {
        Node temp = head;
        int i = 1;
        while (i < dposition - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    private static void deleteLast(Node head) {
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    private static Node deleteFirst(Node head) {
        head = head.next;
        return head;
    }

    private static void addMid(Node head, int position) {
        Node temp = head;
        int i = 1;
        while (i < position - 1) {
            temp = temp.next;
            i++;
        }
        Node nn = getNode();
        nn.next = temp.next;
        temp.next = nn;
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
