class deque{
    int[] arr;
    int cap;
    int front;
    int size;
    deque(int x){
        arr=new int[x];
        cap=x;
        front = 0;
        size = 0;
    }
    boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==cap;
    }
    void insertFront(int x){
        if (isFull()){
            return ;
        }
        front = (front-1+cap)%cap;
        arr[front]= x;
        size++;
    }
    void insertRear(int x){
        if (isFull()){
            return ;
        }
        int rear = (front+size)%cap;
        arr[rear]=x;
        size++;
    }
    void deleteFront(){
        if (isEmpty()){
            return ;
        }
        front = (front+1)%cap;
        size--;
    }
    void deleteRear(){
        if(isEmpty()){
            return;
        }
        size--;
    }
    int getSize(){
        return size;
    }
    int getFront(){
        return arr[front];
    }
    int getRear(){
        if (isEmpty()){
            return -1;
        }
        int rear = (front+size-1)%cap;
        return arr[rear];
    }
}
public class ArrayImplementation {
    public static void main(String[] args) {
        deque d = new deque(5);
        d.insertFront(5);
        d.insertRear(10);
        d.deleteFront();
        d.insertFront(10);
        d.insertRear(15);
        d.insertFront(20);
        System.out.println(d.getFront());
        d.deleteFront();
        System.out.println(d.getFront());
        System.out.println(d.getRear());
        System.out.println(d.getSize());
    }
}
