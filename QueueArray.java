class Queue{
    static final int n = 5;
    int front;
    int rear;
    int que[] = new int[n];

    public Queue(){
        front = -1;
        rear = -1;
    }

    public boolean isFull(){
        if(front == 0 && rear == n-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (front == -1){
            return true;
        }
        return false;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(front == -1){
                front = 0;
            }
            que[++rear] = data;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int element = que[front];
            for(int i=front; i<rear; i++){
                que[i] = que[i+1];
            }
            rear--;
            return element;
        }
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front; i<=rear; i++){
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueArray{
    public static void main(String args[]){
        Queue obj = new Queue();

        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);

        obj.display();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();

        obj.display();
    }
}