package queues;

public class Queues {
    private int arr[];
    private int size;
    private int capacity;
    private int rear;
    private int front;

    public Queues(int capacity) {
        this.capacity = capacity;
        this.arr=new int[this.capacity];
        this.rear=-1;
        this.front=-1;
        this.size=0;
    }
    public  boolean isEmpty(){
        return this.size==0;
    }
    public boolean isFull(){
        return this.size==capacity;
    }
    public void add(int data){
        if(isFull()){
            System.out.println("full");
            return;
        }

        rear=(rear+1)%capacity;
        arr[rear]=data;
        size++;

    }
    public int remove(){
        if(isEmpty())
            return -1;
        front=(front+1)%capacity;
        int res=arr[front];
        arr[front]=-1;
        size--;
        return res;
    }
    public int peek(){
        if(isEmpty())
            return -1;
        front=(front+1)%capacity;
        return arr[front];

    }
    public void display(){
        int temp=front+1;
        for(int i=0;i<size;i++){
            System.out.println(arr[(temp+i)%capacity]);
        }
    }

    public static void main(String[] args) {
        Queues q=new Queues(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        q.display();



    }

}
