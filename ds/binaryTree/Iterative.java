package ds.binaryTree;

public class Iterative {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 5;
        System.out.println("index of element: " + searchK(a, k));
    }

    private static int searchK(int[] a, int k) {
        int l = 0;
        int r = a.length - 1;

        int mid = (l + r) / 2;

        while (l <= r) {
            if (a[mid] == k)
                return mid;
            else if (k < a[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
            mid = (l + r) / 2;
        }
        return -1;
    }
}
