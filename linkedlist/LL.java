package linkedlist;


public class LL {
    private  static Node head;

    static class Node {
        static Node head;
        Node tail;
        Node next;
        int data;

        public Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }
        public static void reverse(){
            Node prev=null;
            Node next=null;
            Node current=head;
            while (current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            head=prev;
        }
        public void display(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }


    public static void main(String[] args) {
        LL ls=new LL();
        ls.head=new Node(10);
        ls.head.next=new Node(20);
        ls.head.next.next=new Node(30);
        System.out.println(ls.head.data);
        System.out.println(ls.head.next.data);
        System.out.println(ls.head.next.next.data);
        System.out.println(ls);

        //System.out.println(ls.reverse());
        

    }


}
