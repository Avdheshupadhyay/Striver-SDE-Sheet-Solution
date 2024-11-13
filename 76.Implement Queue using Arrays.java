public class Queue {
    int front, rear, size;
    int[] queue;

    public Queue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            size++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int value = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return value;
        }
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[front];
        }
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[rear];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.dequeue());
        System.out.println(q.front());
        System.out.println(q.rear());
    }
}
