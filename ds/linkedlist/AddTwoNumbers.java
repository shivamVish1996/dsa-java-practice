package ds.linkedlist;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * <p>
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * <p>
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */
public class AddTwoNumbers {

    Node head;

    public static void main(String[] args) {

        AddTwoNumbers firstList = new AddTwoNumbers();
        Node n1 = new Node(9);
//        Node n2 = new Node(4);
//        Node n3 = new Node(3);
//        Node n4 = new Node(9);
//        Node n5 = new Node(9);
//        Node n6 = new Node(9);
//        Node n7 = new Node(9);
        firstList.head = n1;
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        n5.next = n6;
//        n6.next = n7;
        printLinkedList(firstList.head);

        AddTwoNumbers secondList = new AddTwoNumbers();
        Node n8 = new Node(1);
        Node n9 = new Node(9);
        Node n10 = new Node(9);
        Node n11 = new Node(9);
        Node n12 = new Node(9);
        Node n13 = new Node(9);
        Node n14 = new Node(9);
        Node n15 = new Node(9);
        Node n16 = new Node(9);
        Node n17 = new Node(9);
        secondList.head = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = n11;
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;
        n15.next = n16;
        n16.next = n17;
        printLinkedList(secondList.head);

        Integer num1 = getReversedNumber(firstList.head);
             System.out.println(num1);
        Integer num2 = getReversedNumber(secondList.head);
             System.out.println(num2);

        createLinkedList(num1 + num2);
    }

    private static void createLinkedList(Integer sum) {

        AddTwoNumbers resultList = new AddTwoNumbers();

         System.out.println(sum);
        if (sum == 0) {
            resultList.head = new Node(0);
        }
        while (sum > 0) {
            Node newNode = new Node(sum % 10);

            if (resultList.head == null) {
                resultList.head = newNode;
            } else {
                Node curNode = resultList.head;
                while (curNode.next != null) {
                    curNode = curNode.next;
                }
                curNode.next = newNode;
            }
            sum = sum / 10;
        }
        printLinkedList(resultList.head);
    }

    private static Integer getReversedNumber(Node head) {
        Node cur = head;
        int sum = 0;
        while (cur != null) {
            sum = Math.multiplyExact(sum, 10) + cur.val;
            cur = cur.next;
        }

        int num = sum, reversedNumber = 0;
        while (num != 0) {
            reversedNumber = reversedNumber * 10 + num % 10;
            num = num / 10;
        }
        return reversedNumber;
    }

    public static void printLinkedList(Node head) {
        Node cur = head;
        System.out.print("head->");
        while (cur != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
        System.out.print("null");
        System.out.println();
    }

    static class Node {
        private int val;
        private Node next;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node n) {
            this.val = val;
            this.next = n;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}



