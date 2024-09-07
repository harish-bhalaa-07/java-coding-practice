
class stack{
    static final int n = 5;
    int stack[] =  new int[n];
    int top;

    public stack(){
        top = -1;
    }

    public void push(int data){
        if(top == n-1){
            throw new StackOverflowError("Stack overflow");
        }
        stack[++top] = data;   
    }

    public int pop(){
        if(top == -1){
            throw new IndexOutOfBoundsException("stack underflow");
        }
        return stack[top--];
    }

    public int peek(){
        if(top == -1){
            throw new IndexOutOfBoundsException("stack underflow");
        }
        return stack[top];
    }

    public void display(){
        if(top == -1){
            throw new IndexOutOfBoundsException("Stack underflow");
        }
        for(int i= top; i>=0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class StackArray {
    public static void main(String args[]){
        stack obj = new stack();

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.display();
        System.out.println(obj.peek() + " is the peek element");

        System.out.println(obj.pop()+ " is popped from the stack");
        System.out.println(obj.pop()+ " is popped from the stack");
        obj.display();
    }
}