import java.util.Scanner;
class Stack{
    private int top;
    private  int size;
    private  int[] ArrayStack;
    public Stack(int size){
        top = -1;
        this.size = size;
        ArrayStack = new int[size];
    }
    public void push(int x){
        if(top == size-1){
            System.out.println("Stack is full");
        }
        else {
            ArrayStack[++top] = x;
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else{
            int popped = ArrayStack[top];
            top--;
            size--;
            return popped;
        }

    }
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return ArrayStack[top];
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            System.out.println("Stack is empty");
            return true;
        }
        else{
            return false;
        }
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxSize=sc.nextInt();
        Stack stack = new Stack(maxSize);
        int n=sc.nextInt();
        // for push element in stack
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        int m=sc.nextInt();
        // for pop element in stack
        for(int i=0;i<m;i++){
            System.out.println("stack.pop() = " + stack.pop());
        }
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}