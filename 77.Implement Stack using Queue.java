import java.util.*;

public class StackUsingQueue {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public StackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int value) {
        queue1.add(value);
    }

    public int pop() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        int poppedValue = queue1.poll();

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return poppedValue;
    }

    public int top() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        int topValue = queue1.peek();
        queue2.add(queue1.poll());

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topValue;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
    }
}
