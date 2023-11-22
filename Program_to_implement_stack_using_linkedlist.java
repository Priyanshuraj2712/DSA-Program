class stack_ll_demo{
    int length;
    Node top;
    class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }
    }
    stack_ll_demo(){
        top = null;
        length = 0;
    }
    int length(){
        return length;
    }
    Boolean isEmpty(){
        return length == 0;
    }
    void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }
    void pop(){
        if(isEmpty())
            System.out.println("Stack is empty");
        top = top.next;
        length--;
    }
    int peek(){
        if(isEmpty())
            System.out.println("Stack is empty");
        return top.data;
    }
    void display(){
        Node current = top;
        System.out.print("Stack is: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Main_Linkedlist {
    public static void main(String[] args) {
        stack_ll_demo s = new stack_ll_demo();
        System.out.println("Stack is empty: "+s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(43);
        s.display();
        System.out.println("Size is: "+s.length);
        System.out.println("Peek value is: "+s.peek());
        s.pop();
        System.out.println("Afte pop out");
        s.display();
        System.out.println("After poping Peek value is: "+s.peek());
    }
}
