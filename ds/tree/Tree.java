package ds.tree;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

/*
              2
           3      4
        1    3   2

inorderTraversal
1 3 3 2 2 4
preorderTraversal
2 3 1 3 4 2
postorderTraversal
1 3 3 2 4 2
levelOrderTraversal
2 3 4 1 3 2
if we want to print level order traversal line by line,
eg: 2
    3 4
    1 3 2
    we can add null in queue
leftViewOfBinaryTree
2 3 1
RightViewOfBinaryTree (just change the 2 line i.e root.left to root.right and vice versa)
2 4 2
 */
public class Tree {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Node root = createTree();

        System.out.println("inorderTraversal");
        inorderTraversal(root);
        System.out.println();
        System.out.println("preorderTraversal");
        preorderTraversal(root);
        System.out.println();
        System.out.println("postorderTraversal");
        postorderTraversal(root);
        System.out.println();
        System.out.println("levelOrderTraversal");
        levelOrderTraversal(root);
        System.out.println();
        System.out.println("levelOrderTraversalLineByLine");
        levelOrderTraversalLineByLine(root);
        System.out.println();
        System.out.println("leftViewOfBinaryTree");
        leftViewOfBinaryTree(root);
    }

    private static void leftViewOfBinaryTree(Node root) {

        List<Integer> list = new ArrayList<>();

        printLeftViewOfBinaryTree(root, list, 0);

        list.forEach(element -> System.out.print(element + " "));
    }

    private static void printLeftViewOfBinaryTree(Node root, List<Integer> list, int level) {

        if (root == null)
            return;

        if (list.size() == level) {
            list.add(level, root.data);
        }

        //for right view just change the below 2 line i.e root.left to root.right and vice versa
        printLeftViewOfBinaryTree(root.left, list, level + 1);
        printLeftViewOfBinaryTree(root.right, list, level + 1);
    }

    //for printing line by line, add null
    private static void levelOrderTraversalLineByLine(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
            queue.add(null);
        }
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr == null) {
                if (queue.isEmpty())
                    return;
                queue.add(null);
                System.out.println();
                continue;
            } else {
                System.out.print(curr.data + " ");
            }
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }

    //this can also be solve using recursion O(n^2)
    private static void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr != null) {
                System.out.print(curr.data + " ");
            }
            assert curr != null;
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }

    }

    private static void inorderTraversal(Node root) {
        if (root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    private static void preorderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    private static void postorderTraversal(Node root) {
        if (root == null)
            return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    private static Node createTree() {

        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1)
            return null;

        Node root = new Node(data);
        System.out.println("Enter left of " + data + ": ");
        root.left = createTree();
        System.out.println("Enter right of " + data + ": ");
        root.right = createTree();
        return root;
    }
}
