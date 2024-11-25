interface Queue {
    void enqueue(int item);
    int dequeue();
    int peek();
    boolean isEmpty();
    int size();
}

class ArrayQueue implements Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public ArrayQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    @Override
    public void enqueue(int item) {
        if (count == capacity) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity; 
        queue[rear] = item;
        count++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Indicates an error
        }
        int item = queue[front];
        front = (front + 1) % capacity; 
        count--;
        return item;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Indicates an error
        }
        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class QueueExp {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Display queue

        System.out.println("Peek: " + queue.peek());
        
        queue.dequeue();
        queue.display(); // Display queue after dequeue

        System.out.println("Size of queue: " + queue.size());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // Attempt to dequeue from empty queue
    }
}
