package finalExam;

public class Problem3 {

    /**
     * A non-recursive method that merges two sorted lists, arr1 and arr2,
     * into one sorted list and returns it.
     * The method should have linear running time.
     * You may use a temporary array of size arr1.length + arr2.length to hold the results.
     * @param arr1 input sorted array 1
     * @param arr2 input sorted array 2
     * @return sorted array that contains elements from arr1 and arr2
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        // FILL IN CODE

        return res;
    }


    /** Print a given array of integers
     * @param arr input array
     */
    public static void print(int[] arr) {
            for (int elem : arr)
                System.out.print(elem + " ");
            System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 9, 10, 25};
        int[] arr2 = {1, 4, 8, 30, 40, 50, 60};
        int[] res = merge(arr1, arr2);
        print(res);
    }
}
