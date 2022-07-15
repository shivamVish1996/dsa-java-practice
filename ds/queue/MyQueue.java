package ds.queue;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

public class MyQueue {
    static Node front, rear;

    public static void main(String[] args) throws Exception {
        enqueue(5);
        enqueue(1);
        enqueue(6);
        enqueue(2);
        printQueue();
        dequeue();
        printQueue();
        dequeue();
        printQueue();
    }

    private static int dequeue() throws Exception {
        if (front == null) {
            throw new Exception("empty is queue");
        }
        int data = front.data;
        front = front.next;
        return data;
    }

    private static void printQueue() {
        Node n = front;
        System.out.print("front->");
        while (n != null) {
            if (n.next == null)
                System.out.print(n.data);
            else
                System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println("<-rear");
    }

    private static void enqueue(int data) {
        Node n = new Node(data);

        if (front == null) {
            front = rear = n;
            return;
        }

        rear.next = n;
        rear = n;
    }
}
