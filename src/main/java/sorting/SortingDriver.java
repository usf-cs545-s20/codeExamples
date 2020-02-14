package sorting;

public class SortingDriver {
    public static void main(String[] args) {
        int[] a = {6, 1, 9, 2, 5, 8, 9, 3, 6, 4};
        System.out.println("Array before bubble sort:");
        SortingAlgorithms.print(a);
        SortingAlgorithms.bubbleSort(a);
        System.out.println("Array after bubble sort:");
        SortingAlgorithms.print(a);
        System.out.println();

        int[] b = {6, 1, 9, 2, 5, 8, 9, 3, 6, 4};
        System.out.println("Array before insertion sort:");
        SortingAlgorithms.print(b);
        SortingAlgorithms.insertionSort(b);
        System.out.println("Array after insertion sort:");
        SortingAlgorithms.print(b);
        System.out.println();

        int[] c = {6, 1, 9, 2, 5, 8, 9, 3, 6, 4};
        System.out.println("Array before shell sort:");
        SortingAlgorithms.print(c);
        SortingAlgorithms.shellSort(c);
        System.out.println("Array after shell sort:");
        SortingAlgorithms.print(c);
        System.out.println();

        int[] d = {6, 1, 9, 2, 5, 8, 9, 3, 6, 4};
        System.out.println("Array before selection sort:");
        SortingAlgorithms.print(d);
        SortingAlgorithms.selectionSort(d);
        System.out.println("Array after selection sort:");
        SortingAlgorithms.print(d);
        System.out.println();

        int[] e = {6, 1, 9, 2, 5, 8, 9, 3, 6, 4};
        System.out.println("Array before merge sort:");
        SortingAlgorithms.print(e);
        SortingAlgorithms.mergeSort(e);
        System.out.println("Array after merge sort:");
        SortingAlgorithms.print(e);

        int[] f = {6, 1, 9, 2, 5, 8, 9, 3, 6, 4};
        System.out.println("Array before quick sort:");
        SortingAlgorithms.print(f);
        SortingAlgorithms.quickSort(f);
        System.out.println("Array after quick sort:");
        SortingAlgorithms.print(f);

        Elem[] elems = {new Elem(10, "cat"), new Elem(2, "dog"), new Elem(11, "horse"),
                new Elem(6, "bird"),
                new Elem(8, "elephant")};
        System.out.println("Array before bin sort:");
        SortingAlgorithms.print(elems);
        SortingAlgorithms.binSort(elems, 11);
        System.out.println("Array after bin sort:");
        SortingAlgorithms.print(elems);
    }
}
