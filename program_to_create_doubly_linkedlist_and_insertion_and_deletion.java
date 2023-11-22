public class DoublyLinkedlist {
    Node head, tail;
    int length = 0;
    class Node{
        int data;
        Node prev, next;
        Node(int d){
            data = d;
            next = null;
            prev = null;
        }  
    }
        boolean isEmpty(){
            return length == 0;
        }
        void display(){
            if(head == tail)
                return;
            else{
                Node temp = head;
                while(temp!=null){
                    System.out.println(temp.data);
                    temp = temp.next;
                }
                System.out.println("null");
            }
        }
        void insertAtBeg(int val){
            Node n = new Node(val);
            if(isEmpty())
                tail = n;
            else{
                head.prev = n;
            }
            n.next = head;
            head = n;
            length++;
        }
        void insertAtPosition(int val, int pos) {
            Node n = new Node(val);
            if (pos == 0) {
                insertAtBeg(val);
                return;
            }
            if (isEmpty()) {
                System.out.println("List is empty. Cannot insert at position " + pos);
                return;
            }
            Node current = head;
            int count = 0;
            while (current!=null&&count<pos - 1) {
                current = current.next;
                count++;
            }
            if (current == null) {
                insertAtLast(val);
            } else {
                n.next = current.next;
                n.prev = current;
                if (current.next != null) {
                    current.next.prev = n;
                }
                current.next = n;
                length++;
            }
        }        
        void insertAtLast(int val){
            Node n = new Node(val);
            if(isEmpty())
                head = n;
            else{
                tail.next = n;
                n.prev = tail;
            }
            tail = n;
            length++;
        }
        Node deleteAtBeg(){
            Node temp = head;
            if(head == tail)
                tail = null;
            else
                head.next.prev = null;
            head = head.next;
            temp.next = null;
            return temp;
        }
        void deleteAtPosition(int pos) {
            if (isEmpty()||pos < 0||pos >= length) {
                System.out.println("Invalid position or list is empty.");
                return;
            }
            if (pos == 0) {
                deleteAtBeg();
            } else if (pos == length-1){
                deleteAtLast();
                return;
            } else {
                int count = 0;
                Node current = head;
                while (count < pos) {
                    current = current.next;
                    count++;
                }
                current.prev.next = current.next;
                current.next.prev = current.prev;
                current.prev = null;
                current.next = null;
                length--;
            }
        }        
        Node deleteAtLast(){
            Node temp = tail;
            if(head == tail)
                head = null;
            else
                tail.prev.next = null;
            tail = tail.prev;
            temp.prev = null;
            return temp;
        }
        public static void main(String[] args) {
            DoublyLinkedlist dl = new DoublyLinkedlist();
            dl.insertAtBeg(10);
            dl.insertAtBeg(25);
            dl.insertAtPosition(3,3);
            dl.insertAtLast(23);
            dl.insertAtLast(35);
            System.out.println("List is:");
            dl.display();
            System.out.println("After deletetion:");
            dl.deleteAtBeg();
            dl.deleteAtLast();
            dl.deleteAtPosition(1);  
            dl.display();
        }
    }
