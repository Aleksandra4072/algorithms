public class Main {
    public static void main(String[] args) {
        int[] unsortedList = {22, 55, 99, 4, 6, 105, 98, 55};
        System.out.println(LinearSearch.run(unsortedList, 55));

        for (int element : SelectionSort.run(unsortedList)) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println(BinarySearch.run(unsortedList, 44));
        System.out.println(BinarySearch.run(unsortedList, 55));
    }
}