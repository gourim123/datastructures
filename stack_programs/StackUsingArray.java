public class StackUsingArray {
    int top;
    int size;
    int[] arr;
    StackUsingArray(int size){
        this.size=size;
        this.arr=new int[size];
        this.top=-1;

    }
    public boolean isEmpty(){
        return this.arr[size]==-1;
        //return top==-1;
    }
    public boolean isFull(){

        return top==size-1;
    }
    public void push(int data) {
        if (!isFull()) {
            top++;
            arr[top] = data;
        } else {
            System.out.println("full");
        }
    }
    public int pop() {
        if (!isEmpty()) {
            int popelement = top;
            top--;
            return arr[popelement];
        } else {
            return -1;

        }
    }
    public int peek(){
        if(!isEmpty()){
            return arr[top];
        }else
            return -1;
    }
    public static void main(String args[]){
        StackUsingArray sa=new StackUsingArray(3);
        sa.push(1);
        sa.push(4);
        sa.push(12);
        sa.pop();
        System.out.println(sa.peek());

    }

}
