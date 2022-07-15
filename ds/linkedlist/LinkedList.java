package ds.linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

public class LinkedList {
    static Node head;

    public static void main(String[] args) {

        add(7);
        //     traverse(head);
        add(3);
        //     traverse(head);
        add(1);
        //    traverse(head);
        add(9);
        //    traverse(head);

        delete(1);
        traverse(head);

        Node toReverse = head;
        Node newHead = reverse(toReverse);
        traverse(newHead);
  //      sort(newHead);
        traverse(newHead);
    }

    private static void sort(Node newHead) {
        Node first = newHead;
        Node second = newHead.next;

        while (first != null && second != null) {

            if (first.data > second.data) {
                //swap
                int temp = first.data;
                first.data = second.data;
                second.data = temp;
            }

            first = first.next;
            second = second.next;
        }
    }

    private static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    private static void delete(int position) {
        if (head == null) {
            return;
        } else {
            Node n = head;
            for (int i = 0; i < position - 1; i++) {
                n = n.next;
            }
            n.next = n.next.next;
        }
    }

    private static void add(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
        } else {
            Node prev = head;
            while (prev.next != null) {
                prev = prev.next;
            }
            prev.next = n;
        }
    }

    private static void traverse(Node head) {
        Node curNode = head;
        System.out.print("head->");
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("null");
    }
}
