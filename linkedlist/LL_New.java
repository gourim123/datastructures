package linkedlist;

public class LL_New {
    Node head;
    Node tail;
    int size;
    public LL_New() {
        this.size = 0;
        this.head=null;
        this.tail=null;
    }
    public void insertFirst(int val){
        Node n=new Node(val);
        n.next=head;
        head=n;
        if (tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int val){
        Node n=new Node(val);
        if(tail!=null){
            tail.next=n;
            tail=n;
            size++;
        }
    }
    public void insertAtPos(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node current=head;
        for(int i=1;i<index;i++){
            current=current.next;
        }
        Node n=new Node(val,current.next);
        current.next=n;
        size++;
    }
    public int deleteFirst(){
        int val= head.val;
        head=head.next;
        if(head==null){
            tail=null;

        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val= tail.val;
        tail=secondLast;
        tail.next=null;
        return val;
    }
    public  int deleteAtIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val= prev.next.val;
        prev.next=prev.next.next;
        return val;
    }
    public Node find(int val){
        Node n=head;
        while (n!= null){
            if (n.val==val){
                return n;
            }
            n=n.next;
        }
        return n;
    }
    public Node get(int index){
        Node n=head;
        for(int i=0;i<index;i++){
            n=n.next;
        }
        return n;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val +" -> ");
            temp=temp.next;
        }
        System.out.println("end");
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next=next;
        }
    }

    public static void main(String[] args) {
        LL_New list=new LL_New();
        list.insertFirst(3);
        list.insertFirst(1);
        list.insertFirst(4);
        list.display();
        list.insertLast(99);
        list.display();
        list.insertAtPos(5,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteAtIndex(2));
        list.display();
        System.out.println(list.find(3));
       list.display();


    }
}
