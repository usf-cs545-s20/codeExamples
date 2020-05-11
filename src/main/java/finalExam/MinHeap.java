package finalExam;

public class MinHeap {
    private int[] heap; // the array to store the heap
    private int maxsize; // the size of the array
    private int size; // the current number of elements in the array

    public MinHeap(int max) {
        maxsize = max;
        heap = new int[maxsize];
        size = 0;
        heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int index) {
        return index / 2;
    }

    // Assume we have some method to build the heap - it is not shown here

}

