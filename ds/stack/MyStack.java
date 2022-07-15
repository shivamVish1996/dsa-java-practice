package ds.stack;

import java.util.Arrays;

public class MyStack {
    int[] a;
    int top;
    int capacity;

    public MyStack(int capacity) {
        a = new int[capacity];
        top = -1;
        this.capacity = capacity;
    }

    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(5);
        myStack.push(5);
        myStack.push(10);
        myStack.push(0);
        myStack.push(5);
        myStack.push(10);

        printMyStack(myStack);

        System.out.println("peek1: " + myStack.peek());
        System.out.println("pop1: " + myStack.pop());
        printMyStack(myStack);
        System.out.println("peek2: " + myStack.peek());
        System.out.println("pop2: " + myStack.pop());
        printMyStack(myStack);
        System.out.println("peek3: " + myStack.peek());
        System.out.println("pop3: " + myStack.pop());
        printMyStack(myStack);

    }

    private static void printMyStack(MyStack stack) {
        Arrays.stream(stack.a).forEach(element -> System.out.print(element + " "));
    }

    void push(int data) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }
        top++;
        a[top] = data;
        System.out.println("top: " + top);
    }

    private boolean isFull() {
        System.out.println("isFull():top: " + top);
        return top == capacity - 1;
    }

    private int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return a[top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int data = a[top];
        top--;
        return data;
    }

}
