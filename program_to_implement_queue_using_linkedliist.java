import java.util.Scanner;
class queue_demo{
    static class ListNode{
        ListNode next;
        int data;
        ListNode(int d){
            data = d;
            next = null;
        }
    }
        ListNode front = null;
        ListNode rear = null;
        void enqueue(Scanner sc){
            System.out.println("Enter the element");
            int data = sc.nextInt();
            ListNode n = new ListNode(data);
            if(front == null)
                front = rear = n;
            else{
                rear.next = n;
                rear = n;
            }
        }
        int dequeue(){
            int result = front.data;
            if(front == null)
                System.out.println("Underflow");
            else
                front = front.next;
            return result;
        }   
        int peek(){
            return front.data;
        }
        Boolean isEmpty(){
            return front == null;
        }
        void display(){
            ListNode temp = front;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
}
public class QueueLL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue_demo q1 = new queue_demo();
        int n;
        while (true) {
            System.out.println("Enter 1 to insert an element");
            System.out.println("Enter 2 to delete an element");
            System.out.println("Enter 3 to check if the queue is empty");
            System.out.println("Enter 4 to print the top element");
            System.out.println("Enter 5 to display the queue");
            System.out.println("Enter 6 to exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    q1.enqueue(sc);
                    break;
                case 2:
                    int dequeued = q1.dequeue();
                    if (dequeued != -1) {
                        System.out.println("Dequeued element: " + dequeued);
                    }
                    break;
                case 3:
                    System.out.println("Queue is empty: " + q1.isEmpty());
                    break;
                case 4:
                    int topElement = q1.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;
                case 5:
                    q1.display();
                    break;
                case 6:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }
}
