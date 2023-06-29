package queues;

class QueueClass{
    static int size;
    static int arr[];
    static int rear=-1;
    static int front=-1;
    static int capacity;
    QueueClass(int n){
        arr=new int[n];
        this.size=n;
    }
    public static boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }
    public static void add(int data){
        if(isFull()){
            System.out.println("full queue");
            return;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }
    //deque -O(1)
    public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        front=(front+1)%size;
        int res=arr[front];
        arr[front]=-1;

        //single element condition

        return res;
    }
    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[front];
    }
    public void display(){
        int temp=front+1;
        for(int i=0;i<size;i++){
            System.out.println(arr[(temp+i)%size]);
        }
    }
}
public class CircularQueue {
    public static void main(String args[]) {
        QueueClass q = new QueueClass(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        q.display();
    }

}
