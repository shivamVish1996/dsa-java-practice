package ds.stack;

import java.util.ArrayList;
import java.util.List;

public class MyStackUsingArrayList {
    List<Integer> a;
    int top;

    public MyStackUsingArrayList() {
        a = new ArrayList<>();
        top = -1;
    }

    public static void main(String[] args) throws Exception {
        MyStackUsingArrayList myStack = new MyStackUsingArrayList();
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

    private static void printMyStack(MyStackUsingArrayList stack) {
        stack.a.forEach(element -> System.out.print(element + " "));
    }

    void push(int data) throws Exception {
        top++;
        a.add(data);
        System.out.println("top: " + top);
    }


    private int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return a.get(top);
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int data = a.get(top);
        a.remove(top);
        top--;
        return data;
    }

}
