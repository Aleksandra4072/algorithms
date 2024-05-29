public class Main {
    public static void main(String[] args) {
        int[] unsortedList = {22, 55, 99, 4, 6, 105, 98, 55};
        System.out.print("Linear search >>> ");
        System.out.println(SearchingAlgorithms.linearSearch(unsortedList, 55));

        System.out.print("Bubble sort >>> ");
        printArray(SortingAlgorithms.bubbleSort(unsortedList));

        System.out.print("Binary search >>> ");
        System.out.println(SearchingAlgorithms.binarySearch(unsortedList, 55));
        System.out.println(SearchingAlgorithms.binarySearch(unsortedList, 44));


        int[] unsortedList2 = {22, 55, 203, 45, 68, 105, 98, 55, 3, 268};
        System.out.print("Selection sort >>> ");
        printArray(SortingAlgorithms.selectionSort(unsortedList2));

        int[] unsortedList3 = {22, 55, 203, 32, 88, 105, 98, 55, 203, 268};
        System.out.print("Insertion sort >>> ");
        printArray(SortingAlgorithms.insertionSort(unsortedList3));

    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}