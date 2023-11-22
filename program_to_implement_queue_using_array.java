import java.util.*;
class Main1{
    int F = -1, R = -1;
    int arr[] = new int[10];
    void enqueue(Scanner sc) {
        if (isFull())
            System.out.println("Overflow");
        else {
            System.out.println("Enter element to insert");
            int i = sc.nextInt();
            if (F == -1 && R == -1) {
                F = R = 0;
                arr[R] = i;
            } else {
                R = R + 1;
                arr[R] = i;
            }
        }
    }
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        } else {
            int result = arr[F];
            if (F == R) {
                F = R = -1;
            } else {
                F = F + 1;
            }
            return result;
        }
    }
    Boolean isEmpty() {
        return F == -1;
    }
    Boolean isFull() {
        return (R == arr.length - 1) && (F == 0);
    }
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[F];
    }
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Elements are: ");
            for (int i = F; i <= R; i++)
                System.out.println(arr[i]);
        }
    }
}
public class Queue_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main1 q = new Main1();
        int n;
        while (true) {
            System.out.println("Enter 1 to insert an element");
            System.out.println("Enter 2 to delete an element");
            System.out.println("Enter 3 to check if the queue is empty");
            System.out.println("Enter 4 to check if the queue is full");
            System.out.println("Enter 5 to print the top element");
            System.out.println("Enter 6 to display the queue");
            System.out.println("Enter 7 to exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    q.enqueue(sc);
                    break;
                case 2:
                    int dequeued = q.dequeue();
                    if (dequeued != -1) {
                        System.out.println("Dequeued element: " + dequeued);
                    }
                    break;
                case 3:
                    System.out.println("Queue is empty: " + q.isEmpty());
                    break;
                case 4:
                    System.out.println("Queue is full: " + q.isFull());
                    break;
                case 5:
                    int topElement = q.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;
                case 6:
                    q.display();
                    break;
                case 7:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }
}
