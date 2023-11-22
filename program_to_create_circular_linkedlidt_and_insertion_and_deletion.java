class Node{
	private int data;
	private Node next;
    public Node setNext;
	public Node(){
	  	data=0;
	  	next=null;
    }
	public Node(int d, Node n){
		data=d;
		next=n;
	}
	public void setData(int d){
		data=d;
	}
    public void setNext(Node n){
        next=n;
    }
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
}
class LinkedList{
    private int size;
    private Node head;
    private Node tail;
    public LinkedList(){
    size=0;
    head=null;
    tail=null;
    }
public boolean isEmpty(){
    if (head==null)
        return true;
    else
        return false;
}
public int getListSize(){
    return size;
}
public void insertAtFirst(int val){
    Node n;
    n=new Node();
    if (head==null){
        head=n;
        tail=n;
    }
    else
        tail.setNext(n);
    n.setData(val);
    n.setNext(head);
    head=n;
    size++;
}
public void insertAtLast(int val){
    Node n,temp;
    temp=tail;
    n=new Node();
    if(isEmpty()){
        head=n;
        tail=n;
    }
    else
        tail.setNext(n);
    n.setData(val);
    n.setNext(head);
    tail=n;
    size++;
}
public void insertAtPos(int val, int pos){
	Node n;
	Node t;
	Node temp;
	t=head;
	n= new Node();
	if(pos==1)
		insertAtFirst(val);

	else if(pos==size+1)
		insertAtLast(val);
    else{
        for(int i=1;i<pos-1;i++)
            t=t.getNext();
    temp=t.getNext();
    n.setData(val);
    n.setNext(t.getNext());
    t.setNext(n);
    size++;
    }
}
public void deleteAtFirst(){
    if (head==null)
        System.out.println("List is empty");
    else{
        head=head.getNext();
        tail.setNext = head;
        size--;
    }
}
public void deleteAtLast(){
    if (head==null)
        System.out.println("List is empty");
    else if(size==1){
        head=null;
        size--;
    }
    else{
    Node t;
    t=head;
    for (int i=1;i<size-1;i++) 
        t=t.getNext();
    t.setNext(head);
    size--;
    }
}
public void deleteAtPos(int pos){
    if (head==null)
        System.out.println("list is empty");
    else if(pos<1 || pos>size)
        System.out.println("invalid position");
    else if(pos==1)
        deleteAtFirst();
    else if(pos==size)
        deleteAtLast();
    else{
        Node t,t1;
        t=head;
    for(int i=1; i<size-1;i++)
        t=t.getNext();
    t1=t.getNext();
    t.setNext(t1.getNext());
    size--;
        }
    }
public void display() {
        Node t;
        t = head;
        if (isEmpty())
            System.out.println("list is empty");
        else {
            for (int i = 1; i <= size; i++) {
                System.out.println("" + t.getData());
                t = t.getNext();
            }
        }
    }
}
public class CircularLinkedlist{
    public static void main(String[] args) {
        LinkedList cll = new LinkedList();
        cll.insertAtFirst(10);
        cll.insertAtFirst(120);
        cll.insertAtLast(23);
        cll.insertAtLast(35);
        cll.insertAtPos(11,3);
        System.out.println("List is: ");
        cll.display();
        cll.deleteAtFirst();
        cll.deleteAtLast();
        cll.deleteAtPos(2);
        System.out.println("After deletion");
       cll.display();
    }
}

        
    
