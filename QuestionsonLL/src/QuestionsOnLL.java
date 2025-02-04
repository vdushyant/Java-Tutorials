import java.util.Scanner;

public class QuestionsOnLL {
    // Data field to store the value of the node
    int data;

    // Pointer/reference to the next node in the list
    QuestionsOnLL next;

    // Constructor to initialize the node with data
    public QuestionsOnLL(int data) {
        this.data = data;
        this.next = null; // By default, the next node is null
    }

    // Optional: Getter for the data
    public int getData() {
        return data;
    }

    // Optional: Setter for the data
    public void setData(int data) {
        this.data = data;
    }

    // Optional: Getter for the next node
    public QuestionsOnLL getNext() {
        return next;
    }

    // Optional: Setter for the next node
    public void setNext(QuestionsOnLL next) {
        this.next = next;
    }

    // Optional: String representation of the node
    @Override
    public String toString() {
        return "Node{data=" + data + "}";
    }

    public static QuestionsOnLL removeNthNodeFromEnd(QuestionsOnLL head, int n) {
        // Create a dummy node pointing to the head
        QuestionsOnLL dummy = new QuestionsOnLL(0);
        dummy.next = head;
        QuestionsOnLL first = dummy;
        QuestionsOnLL second = dummy;

        // Move the first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (first == null) {
                throw new IllegalArgumentException("n is larger than the size of the list");
            }
            first = first.next;
        }

        // Move both pointers until the first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from the end
        second.next = second.next.next;

        return dummy.next;
    }

    public static void printList(QuestionsOnLL head) {
        QuestionsOnLL current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a linked list
        QuestionsOnLL head = new QuestionsOnLL(1);
        head.next = new QuestionsOnLL(2);
        head.next.next = new QuestionsOnLL(3);
        head.next.next.next = new QuestionsOnLL(4);
        head.next.next.next.next = new QuestionsOnLL(5);

        System.out.println("Original list:");
        printList(head);

        // Find the nth node from end and delete it
        System.out.println("Enter the position from the end to delete:");
        int n = sc.nextInt();

        head = removeNthNodeFromEnd(head, n);

        System.out.println("List after removing the " + n + "th node from the end:");
        printList(head);

        sc.close();
    }
}
