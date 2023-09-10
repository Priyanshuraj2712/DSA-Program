class Node{
    int data;
    Node next;
    Node(){
        data = 0;
        next = null;
    }
    Node(int d,Node n){
        data = d;
        next = n;
    }
    void setData(int d){
        data = d;
    }
    void setNext(Node start){
        next = start;
    }
    int getData(){
        return data;
    }
    Node getNext(){
        return next;
    }
}
class Linkedlist{
    int size;
    Node start;
    Linkedlist(){
        size = 0;
        start = null;
    }
    boolean isEmpty(){
        return start == null;
    }
    int getListSize(){
        return size;
    }
    void insertAtStart(int val){
        Node n = new Node();
        n.setData(val);
        n.setNext(start);
        start = n;
        size++;
    }
    void insertAtEnd(int val){
        Node n = new Node();
        Node t = new Node();
        n.setData(val);
        t = start;
        if(t==null)
            start = n;
        else{
            while(t.getNext()!=null)
                t = t.getNext();
            t.setNext(n);
        }
        size++;
    }
    void insertAtPOS(int val,int pos){
        if(pos == 1)
            insertAtStart(val);
        else if(pos == size+1)
            insertAtEnd(val);
        else if(pos>1 && pos<=size){
            Node n = new Node(val,null);
            Node t = start;
            for(int i=1;i<pos-1;i++)
                t = t.getNext();
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }
    }
    void deleteAtStart(){
        if(start == null)
            System.out.println("List is empty");
        else{
            start = start.getNext();
            size--;
        }
    }
    void deleteAtEnd(){
        if(start == null)
            System.out.println("List is empty");
        else if(size == 1){
            start = null;
            size--;
        }
        else{
            Node t;
            t = start;
            for(int i=1;i<size-1;i++)
                t = t.getNext();
            t.setNext(null);
            size--;
        }
    }
    void deleteAtPOS(int pos){
        if(start == null)
            System.out.println("List is empty");
        else if(pos<1 || pos>size)
            System.out.println("Invalid position");
        else if(pos == 1)
            deleteAtStart();
        else if(pos==size)
            deleteAtEnd();
        else{
            Node t,t1;
            t = start;
            for(int i=1;i<pos-1;i++)
                t = t.getNext();
            t1 = t.getNext();
            t.setNext(t1.getNext());
            size--;
        }
    }
    void display(){
        Node t = start;
        while(t != null){
            System.out.println(t.getData()+" ");
            t = t.getNext();
        }
    }
}
public class Linkedlist_demo {
    public static void main(String[] args) {
        Linkedlist l = new Linkedlist();
        System.out.println("List is empty: "+l.isEmpty());
        System.out.println("List size: "+l.getListSize());
        l.insertAtStart(5);
        l.insertAtStart(20);
        l.insertAtStart(10);
        l.insertAtEnd(23);
        l.insertAtEnd(13);
        l.insertAtPOS(26,3);
        System.out.println("List is: ");
        l.display();
        System.out.println("List is empty: "+l.isEmpty());
        System.out.println("List size: "+l.getListSize());
        System.out.println("After deletion: ");
        l.deleteAtStart();
        l.deleteAtPOS(2);
        l.deleteAtEnd();
        l.display();
    }
}
