interface Stack {
    void push(int item);
    int pop();
    int peek();
    boolean isEmpty();
    int size();
}

class ArrayStack implements Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    @Override
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. Cannot push " + item);
            return;
        }
        stack[++top] = item;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        }
        return stack[top--];
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

   
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}


public class StackExp {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); 

        System.out.println("Peek: " + stack.peek());
        
        stack.pop();
        stack.display(); 

        System.out.println("Size of stack: " + stack.size());

        stack.pop();
        stack.pop();
        stack.pop(); 
    }
}
