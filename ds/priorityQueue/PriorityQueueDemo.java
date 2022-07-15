package ds.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
min heap and max heap

can solve below problems
kth largest element in an array - create min heap (default by java)
kth smallest element in an array - create max heap (add comparator Comparator.reverseOrder() in contructor)
 */
public class PriorityQueueDemo {

    static int kthLargestElement(int[] arr, int k) {
        //create min heap (default by java)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        //add k element in priority queue
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }

        //check if other element is greater
        //if greater remove top and add that element
        for (int i = k; i < arr.length; i++) {
            if (minHeap.peek() < arr[i]) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        minHeap.stream().forEach(System.out::print);

        //kth largest element will be at top
        return minHeap.peek();
    }

    static int kthSmallestElement(int[] arr, int k) {
        //create max heap (add comparator Comparator.reverseOrder() in constructor)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        //add k element in priority queue
        for (int i = 0; i < k; i++) {
            maxHeap.add(arr[i]);
        }

        //check if other element is smaller
        //if smaller remove top and add that element
        for (int i = k; i < arr.length; i++) {
            if (maxHeap.peek() > arr[i]) {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        maxHeap.stream().forEach(System.out::print);

        //kth smallest element will be at top
        return maxHeap.peek();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 5, 9, 0, 3};
        int k = 3;

        System.out.println("kthLargestElement: " + kthLargestElement(arr, k));
        System.out.println("kthSmallestElement: " + kthSmallestElement(arr, k));

    }

}
